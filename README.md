# jbock-gradle-example

### Gradle config

Add these dependencies:

````groovy
implementation 'io.github.jbock-java:jbock:5.17'
annotationProcessor 'io.github.jbock-java:jbock-compiler:5.17'
````

Add this to `module-info.java`:

````java
requires net.jbock;
````

### Run it

````sh
./gradlew clean build
jpackage --name cp --type app-image --module-path `./get_module_path` --module jbock.gradle.example/net.jbock.cp.CopyFile --dest build/out
./create_launcher_script >cp && chmod +x cp
./cp --help
./cp 1 2 -rbs 2
````


### See also

* [jbock](https://github.com/jbock-java/jbock)
* [jbock-maven-example](https://github.com/jbock-java/jbock-maven-example)

