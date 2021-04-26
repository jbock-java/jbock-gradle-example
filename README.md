# jbock-gradle-example

### Gradle config

In a gradle project,
[jbock](https://github.com/h908714124/jbock)
is configured by adding two dependencies to `build.gradle`:

````groovy
compileOnly 'com.github.h908714124:jbock-annotations:3.6'
annotationProcessor 'com.github.h908714124:jbock:3.6.003'
````

### Try it

````sh
./gradlew clean run --args='-r ~/Documents /media/archive'
````

