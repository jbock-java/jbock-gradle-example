package net.jbock.cp;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.jbock.Command;
import net.jbock.Option;
import net.jbock.Parameter;

import java.nio.file.Path;
import java.util.Optional;

/**
 * Copy SOURCE to DEST
 */
@Command(name = "cp")
abstract class Args {

    /**
     * Path or file of directory to copy.
     * @return SOURCE
     */
    @Parameter(index = 0)
    abstract Path getSource();

    /**
     * Copy destination
     * @return DEST
     */
    @Parameter(index = 1)
    abstract Path getDest();

    /**
     * Copy directories recursively
     */
    @Option(names = {"--recursive", "-r"})
    abstract boolean isRecursive();

    /**
     * Make a backup of each existing destination file
     */
    @Option(names = {"--backup", "-b"})
    abstract boolean isBackup();

    /**
     * Override the usual backup suffix
     */
    @Option(names = {"--suffix", "-s"})
    abstract Optional<String> getSuffix();


    @Override
    public String toString() {
        try {
            return new ObjectMapper()
                    .setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.ANY)
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
