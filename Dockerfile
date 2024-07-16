FROM openjdk:17
EXPOSE 8080
ADD target/docker-github-actions.jar docker-github-actions.jar
ENTRYPOINT ["java", "-jar", "/docker-github-actions.jar"]