FROM openjdk
EXPOSE 8082
ADD target/user_1.jar user_1.jar
ENTRYPOINT [ "java","-jar","/user_1.jar" ]


