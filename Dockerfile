FROM java:8
MAINTAINER szdc
VOLUME /tmp
ADD /target/wocao-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 40000
ENTRYPOINT [ "java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]