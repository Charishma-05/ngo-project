From openjdk:17
WORKDIR /APP
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests
EXPOSE 8080
CMD ["java", "-jar","target/*.jar"]