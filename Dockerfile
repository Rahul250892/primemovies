FROM openjdk:17
EXPOSE 8080
ADD target/primemovies-action.jar primemovies-action.jar
ENTRYPOINT ["java", "-jar", "/primemovies-action.jar"]

