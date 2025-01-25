# Pull your image from Docker Hub
FROM --platform=linux/amd64 brundambharadwaj/bookstoreapp-0.0.1:latest

# Set the working directory inside the container
WORKDIR /app

# Expose the port your application will run on
EXPOSE 8080

# Command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]
