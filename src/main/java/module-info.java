module jbock.gradle.example {

    requires net.jbock;
    requires com.fasterxml.jackson.databind;
    opens net.jbock.cp to com.fasterxml.jackson.databind;
}