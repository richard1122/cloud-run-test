FROM openjdk:11-jdk
WORKDIR /app
COPY . /app
RUN ./gradlew build

FROM openjdk:11-jre
WORKDIR /app
COPY --from=0 /app/build/libs/cloud-run-1.0.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]
