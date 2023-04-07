FROM eclipse-temurin:17-jdk-alpine
CMD  ["ls"]
COPY ./target/Acceptance-task-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080