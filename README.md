# Spring Boot Web Applications

This repository contains two Spring Boot applications developed as part of my coursework.

## 1. Helloworld Application

- **Description**: A basic microservice providing simple greeting responses.
- **Endpoints**:
  - `GET /hello`: Returns "Hello, World!!!".
  - `GET /howareyou`: Returns "Grand. How are you?".

## 2. Namelist Application

- **Description**: A microservice managing a list of names with capabilities to add, retrieve, and reset.
- **Endpoints**:
  - `GET /reset`: Clears the list of names.
  - `POST /names`: Adds a new name if not empty or duplicate.
  - `GET /names`: Retrieves names in alphabetical order.

## Technologies Used

- **Spring Boot**: For developing RESTful microservices.
- **Postman**: For endpoint testing.
- **Spring Web**: For building web applications and creating REST APIs.
- **Integration Testing**: Used @SpringBootTest and TestRestTemplate to test the application’s endpoints by making HTTP requests.
