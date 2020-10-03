# Getting Started
How to create Docker Image and run Java App (Spring Boot Jar) in a Docker Engine

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)
- [Docker](https://www.docker.com/products/docker-desktop)

## Running the application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Running the application in a Docker Engine
* Create a Docker File  in your root folder
```shell
FROM openjdk:8
ADD target/spring-boot-h2-demo.jar spring-boot-h2-demo.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "spring-boot-h2-demo.jar"]
```

* Build a docker image
```shell
docker build -f Dockerfile -t spring-boot-h2-demo .
```
* Run a  docker image
```shell
docker run -p 8082:8082 spring-boot-h2-demo
```

## Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

## Copyright