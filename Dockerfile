From openjdk:11

# Maintainer 
MAINTAINER "anita"
COPY ./target/cap-demo-0.0.1-SNAPSHOT.jar /
WORKDIR /
CMD ["java", "-jar", "cap-demo-0.0.1-SNAPSHOT.jar"]
