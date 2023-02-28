FROM gradle:7.4-jdk11

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} devsite.jar

ENTRYPOINT ["java", "-jar", "/devsite.jar"]