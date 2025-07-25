FROM openjdk:21
LABEL author="Rod Taylor"
#ARG JAR_FILE
WORKDIR /app
#COPY ${JAR_FILE} helloworld_app.jar
COPY target/helloworld-0.0.1-SNAPSHOT.jar helloworld_app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "helloworld_app.jar"]