FROM openjdk:8
ADD target/docker-springboot.jar docker-springboot.jar
ENTRYPOINT ["java", "-jar", "docker-springboot.jar"]