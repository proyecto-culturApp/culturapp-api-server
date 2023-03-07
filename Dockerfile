FROM eclipse-temurin:11

COPY ./build/libs/culturapp.jar /opt/culturapp/bin/

HEALTHCHECK NONE

WORKDIR /opt/culturapp/bin/
CMD ["java","-Xms256M", "-Xmx1200M", "-jar", "culturapp.jar"]
EXPOSE 1989