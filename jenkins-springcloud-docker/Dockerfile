FROM openjdk:8
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 10010
ENTRYPOINT ["java","-jar","/app.jar"]