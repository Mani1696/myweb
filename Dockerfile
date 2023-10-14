FROM eclipse-temurin:17
COPY target/myweb.jar myweb.jar
CMD ["java","-jar","myweb.jar"]