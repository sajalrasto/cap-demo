From openjdk:11

# Maintainer 
MAINTAINER "Sajal Rastogi"
COPY ./target/UserRegistration1-0.0.1-SNAPSHOT.war  /
WORKDIR /
CMD ["java", "-jar", "UserRegistration1-0.0.1-SNAPSHOT.war"]
