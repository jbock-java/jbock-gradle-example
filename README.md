# jbock-gradle-example

[![core](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock/badge.svg?style=plastic&subject=jbock)](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock)
[![annotations](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock-annotations/badge.svg?color=red&style=plastic&subject=jbock-annotations)](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock-annotations)

### Gradle config

In a gradle project,
[jbock](https://github.com/h908714124/jbock)
is configured by adding two dependencies to `build.gradle`:

````groovy
compileOnly "com.github.h908714124:jbock-annotations:$jbockAnnotationVersion"
annotationProcessor "com.github.h908714124:jbock:$jbockVersion"
````

If you use [idea](https://www.jetbrains.com/idea/) and the IDE doesn't "see" the generated code,
try deleting the project's `.idea` folder and reimporting the project.

### Try it

````sh
gradle clean run --args='-r ~/Documents /media/archive'
````

