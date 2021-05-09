# jbock-gradle-example

### Gradle config

In a gradle project,
[jbock](https://github.com/h908714124/jbock)
is configured by adding two dependencies to `build.gradle`:

````groovy
compileOnly 'com.github.h908714124:jbock-annotations:4.1'
annotationProcessor 'com.github.h908714124:jbock:4.1.001'
````

### Try it

````sh
./gradlew clean run --args='-r ~/Documents /media/archive'
````

