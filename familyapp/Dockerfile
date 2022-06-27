

FROM openjdk:8
ADD target/familyapp-0.0.1-SNAPSHOT.jar .
EXPOSE 3306
COPY . /src/java
WORKDIR /src/java
ENTRYPOINT ["java", "-jar", "/familyapp-0.0.1-SNAPSHOT.jar" ]

