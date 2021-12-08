FROM openjdk:11-jdk-slim
COPY "./target/ProyectoCadenaDeAlmacenesLaGenerica-0.0.1-SNAPSHOT.war" "app.war"
EXPOSE 4001
ENTRYPOINT ["java","-jar","app.war"]