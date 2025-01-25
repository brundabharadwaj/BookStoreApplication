# Pull your image from Docker Hub without specifying the platform
FROM brundambharadwaj/bookstoreapp-0.0.1:latest

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host to the container
COPY build/libs/bookstoreapp-0.0.1.jar app.jar

# Expose the port your Spring Boot application runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
