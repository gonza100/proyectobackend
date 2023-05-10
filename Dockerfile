FROM amazoncorretto:11-alpine-jdk
MAINTAINER MAR
COPY target/mar-0.0.1-SNAPSHOT mar-app.jar
ENTRYPOINT ["JAVA","-JAR","/mar-app.jar]