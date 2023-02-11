FROM eclipse-temurin:17-jdk-alpine as builder

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src

RUN wget https://services.gradle.org/distributions/gradle-7.6-bin.zip
RUN unzip gradle-7.6-bin.zip
ENV GRADLE_HOME /gradle-7.6
ENV PATH $GRADLE_HOME/bin:$PATH

RUN gradle clean build -x test

FROM eclipse-temurin:17-jdk-alpine as finalApp

ENTRYPOINT ["sudo", "mkdir", "/app/"]

WORKDIR app

COPY --from=builder /home/gradle/src/build/libs/Books-0.0.1-SNAPSHOT.jar /app

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "/app/Books-0.0.1-SNAPSHOT.jar"]
