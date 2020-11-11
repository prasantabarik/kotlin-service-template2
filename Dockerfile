FROM openjdk:14-alpine
COPY kotlin-service-template2-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar","app.jar"]
EXPOSE 8097
