# Step 1: Use the modern, official Eclipse Temurin Java 17 runtime
FROM eclipse-temurin:17-jre-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the compiled jar file from your local build directory into the container
COPY build/libs/*.jar app.jar

# Step 4: Run the application
CMD ["java", "-jar", "app.jar"]