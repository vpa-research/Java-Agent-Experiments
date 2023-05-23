# Java-Agent-Experiments

How run this project ?

1. You must install jdk 17.0.1
2. You must download my example of the generated linked list class: https://github.com/alexeev509/GeneratedCollectionClasses
3. You must create "Maven configuration" in intellij idea and add such command: "clean package";
4. You must download this project from this repository: https://github.com/vpa-research/Java-Agent-Experiments
5. You must change this path in pom file to your own path:
-javaagent:target/mockTime-jar-with-dependencies.jar="/Users/alekseevaroslav/Downloads/GeneratedCollectionClasses/target/GeneratedCollectionClasses-1.0-SNAPSHOT.jar"="/Users/alekseevaroslav/Downloads/Java-Agent-Experiments2/replacements for the original classes.txt"
";
MORE PRECISELY you must change path to "GeneratedCollectionClasses-1.0-SNAPSHOT.jar" and "replacements for the original classes.txt" files.
6. You must create "Maven configuration" in intellij idea and add such command: "clean package -DskipTests". And run it;
7. You must create "Maven configuration" in intellij idea and add such command: "surefire:test". And run it;
