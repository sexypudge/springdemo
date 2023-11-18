FROM openjdk:8
EXPOSE 8080
ADD target/*.jar baselinkerdev.jar
ENTRYPOINT [ "java","-jar","/baselinkerdev.jar" ]
