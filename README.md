# Java Spring Web Service

The project is configured to use Gradle and Maven build tool.
You can download released versions and nightly build artifacts of Gradle from: https://gradle.org/downloads/

Maven is downloadable as a zip file at https://maven.apache.org/download.cgi. Only the binaries are required, so look for the link to apache-maven-{version}-bin.zip or apache-maven-{version}-bin.tar.gz.

Once you have downloaded the zip file, unzip it to your computer. Then add the bin folder to your path.

## Build an executable JAR using Gradle
You can run the application from the command line with Gradle or Maven. Or you can build a single executable JAR file that contains all the necessary dependencies, classes, and resources, and run that. This makes it easy to ship, version, and deploy the service as an application throughout the development lifecycle, across different environments, and so forth.

If you are using Gradle, you can run the application using ./gradlew bootRun. Or you can build the JAR file using ./gradlew build. Then you can run the JAR file:

java -jar build/libs/gs-rest-service-0.1.0.jar

If you are using Maven, you can run the application using ./mvnw spring-boot:run. Or you can build the JAR file with ./mvnw clean package. Then you can run the JAR file:

java -jar target/gs-rest-service-0.1.0.jar

## Build an executable JAR using Maven
- mvn compile
- mvn package
- mvn spring-boot:run

## Summary
Basic RESTful web service with Spring. It implements HATEOAS and also use Swagger UI.
