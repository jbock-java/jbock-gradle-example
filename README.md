# jbock-gradle-example

### Gradle config

In a gradle project,
[jbock](https://github.com/h908714124/jbock)
is configured by adding two dependencies:

````groovy
compileOnly 'com.github.h908714124:jbock-annotations:4.4'
annotationProcessor 'com.github.h908714124:jbock:4.4.000'
````

### Try it

````sh
./gradlew clean build
rm -rf out
jpackage --name cp --type app-image --module-path `./get_module_path` --module jbock.gradle.example/net.jbock.cp.CopyFile --dest out
./create_launcher_script >cp
chmod +x cp
./cp --help
````


### See also

* [jbock](https://github.com/h908714124/jbock)
* [jbock-maven-example](https://github.com/h908714124/jbock-maven-example)

