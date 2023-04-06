##
## Build stage
##
#FROM maven:3.8.5-jdk-11-slim AS build
#COPY . .
#RUN mvn clean package -Pprod -DskipTests
#
##
## Package stage
##
#FROM openjdk:15-jdk-alpine
#COPY --from=build /target/Universities-API-0.0.1-SNAPSHOT.jar Universities-API-0.0.1-SNAPSHOT.jar
## ENV PORT=8080
#EXPOSE 8080
#
#ENTRYPOINT ["java","-jar","Universities-API-0.0.1-SNAPSHOT.jar"]

#
# Build stage
#
FROM maven:3.8.1-openjdk-15-slim AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM openjdk:15-jdk-alpine
COPY --from=build /target/Acceptance-task-0.0.1-SNAPSHOT.jar Acceptance-task-0.0.1-SNAPSHOT.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","Acceptance-task-0.0.1-SNAPSHOT.jar"]