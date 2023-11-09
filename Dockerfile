FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-jenkins.jar
ENTRYPOINT ["java","-jar","/spring-jenkins.jar"]