FROM amazoncorretto:17-al2-jdk as builder

RUN yum update -y && yum install -y wget unzip

RUN wget https://services.gradle.org/distributions/gradle-7.6-bin.zip && \
    mkdir /opt/gradle && \
    unzip -d /opt/gradle gradle-7.6-bin.zip && \
    rm gradle-7.6-bin.zip

ENV PATH=$PATH:/opt/gradle/gradle-7.6/bin

COPY . /home/gradle/src

WORKDIR /home/gradle/src

RUN /opt/gradle/gradle-7.6/bin/gradle clean build -x test --debug

FROM amazoncorretto:17-al2-jdk as finalApp

RUN mkdir /app

WORKDIR /app

COPY --from=builder /home/gradle/src/build/libs/backend-0.0.1-SNAPSHOT.jar /app

EXPOSE 8090

CMD ["java", "-jar", "/app/backend-0.0.1-SNAPSHOT.jar"]
