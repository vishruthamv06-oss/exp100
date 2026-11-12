Dockerfile Code
# ==========================================
# STAGE 1: BUILD
# Maven + JDK 17
# ==========================================
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app
# Copy Maven configuration
COPY pom.xml .
# Copy source code
COPY src ./s
