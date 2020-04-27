FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8069
ADD /build/libs/socnetgen-0.0.1-SNAPSHOT.jar socnetgen.jar
ENTRYPOINT ["java","-jar","socnetgen.jar"]