FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

COPY src /.

RUN mvn clean test

EXPOSE 5020

CMD ["java", "main\java\com\devops\lab\Output.java"]
