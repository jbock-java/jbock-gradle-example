# jbock-gradle-example

[![core](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock/badge.svg?style=plastic&subject=jbock)](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock)
[![annotations](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock-annotations/badge.svg?color=red&style=plastic&subject=jbock-annotations)](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock-annotations)

### Gradle config

In a gradle project,
[jbock](https://github.com/h908714124/jbock)
is configured by adding two dependencies to `build.gradle`:

````groovy
compileOnly "com.github.h908714124:jbock-annotations:3.6"
annotationProcessor "com.github.h908714124:jbock:3.6.002"
````

### Try it

````sh
./gradlew clean run --args='-r ~/Documents /media/archive'
````

