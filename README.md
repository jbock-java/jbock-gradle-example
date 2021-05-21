# jbock-gradle-example

### Gradle config

In a gradle project,
[jbock](https://github.com/h908714124/jbock)
is configured by adding two dependencies to `build.gradle`:

````groovy
compileOnly 'com.github.h908714124:jbock-annotations:4.3'
annotationProcessor 'com.github.h908714124:jbock:4.3.001'
````

### Try it

````sh
./gradlew clean build
./package
./cp --help
````
