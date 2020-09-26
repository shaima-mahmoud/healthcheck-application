FROM java

VOLUME /tmp

ADD build/libs/healthcheck-application.jar spring-boot-app.jar


RUN bash -c 'touch /spring-boot-app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-app.jar"]
