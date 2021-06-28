# jbock-gradle-example

### Gradle config

Add these dependencies:

````groovy
implementation 'io.github.jbock-java:jbock:5.1'
annotationProcessor 'io.github.jbock-java:jbock-compiler:5.1'
````

If you use the module system, add this line in your `module-info.java`:

````java
requires net.jbock;
````

### Try it

````sh
./gradlew clean build
java -cp build/libs/jcommander-1.81.jar:build/libs/jbock-gradle-example.jar net.jbock.cp.CopyFile @opts.txt
````


### See also

* [jbock](https://github.com/jbock-java/jbock)
* [jbock-maven-example](https://github.com/jbock-java/jbock-maven-example)

