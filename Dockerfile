FROM openjdk:21
RUN mkdir -p /app
WORKDIR /app
COPY ./target/petadoption-0.0.1-SNAPSHOT.jar /app

CMD ["java", "-jar", "petadoption-0.0.1-SNAPSHOT.jar"]
