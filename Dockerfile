FROM openjdk
COPY target/taleas-*.jar target/taleas.jar
ENTRYPOINT ["java", "-jar", "taleas.jar"]
EXPOSE 8080
