package net.jbock.cp;

import picocli.CommandLine;

public class CopyFile {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Args())
                .execute(args);
        System.exit(exitCode);
    }
}
