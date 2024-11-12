# jbock-gradle-example

### Gradle config

Add these dependencies:

````groovy
implementation 'io.github.jbock-java:jbock:5.19'
annotationProcessor 'io.github.jbock-java:jbock-compiler:5.19'
````

Add this to `module-info.java`:

````java
requires net.jbock;
````

### Run it

````sh
./gradlew clean build
./cp --help
./cp -rbs 1 2 3
````


### See also

* [jbock](https://github.com/jbock-java/jbock)
* [jbock-maven-example](https://github.com/jbock-java/jbock-maven-example)

