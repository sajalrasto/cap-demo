From openjdk:11

# Maintainer 
MAINTAINER "anita"
COPY ./target/UserRegistration1-0.0.1-SNAPSHOT.jar  /
WORKDIR /
EXPOSE 8081
CMD ["java", "-jar", "UserRegistration1-0.0.1-SNAPSHOT.jar"]
