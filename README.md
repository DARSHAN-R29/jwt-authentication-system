# JWT Authentication System

A secure authentication and authorization system built using Spring Boot, Spring Security, JWT, and MySQL.

# Features

- User Registration API
- User Login API
- JWT Token Generation
- JWT Token Validation
- Password Encryption using BCrypt
- Protected REST APIs
- MySQL Database Integration
- Role-Based Security Foundation

# Technologies Used

- Java 21
- Spring Boot 3
- Spring Security
- JWT (JJWT)
- MySQL
- Maven
- Lombok
- Postman
- Git & GitHub

# Project Structure

```text
src/main/java/com/darshan/auth_system/
├── config/
├── controller/
├── dto/
├── entity/
├── repository/
├── service/
└── AuthSystemApplication.java


🔗 API Endpoints
Register User

POST /api/auth/register

{
  "username": "darshan",
  "email": "darshan@gmail.com",
  "password": "password123"
}
Login User

POST /api/auth/login

{
  "username": "darshan",
  "password": "password123"
}
Access Protected Endpoint

GET /api/user/profile

Authorization:
Bearer Token <jwt_token>

Sample Response
Welcome to User Profile!
⚙️ Setup Instructions

Clone the repository:

git clone https://github.com/DARSHAN-R29/jwt-authentication-system.git

Create a MySQL database:

CREATE DATABASE auth_system;
Update application.properties with your MySQL credentials.

Run the application:

mvn spring-boot:run
Test APIs using Postman.
