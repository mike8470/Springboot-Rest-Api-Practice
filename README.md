# Spring Boot REST API – End-to-End Development

## Project Goal

The main objective of this project is to learn and implement **end-to-end REST API development** using Spring Boot. This includes building APIs from controller layer to database layer following industry best practices.

## Features Implemented

* REST API development using Spring Boot
* CRUD operations (Create, Read, Update, Delete)
* Pagination and Sorting
* Search functionality
* DTO pattern implementation
* Exception handling
* Service layer architecture
* JPA/Hibernate integration
* MySQL database integration
* Validation
* Clean layered architecture (Controller → Service → Repository → Database)

## Tech Stack

* Java 8+
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Postman (API Testing)
* Git & GitHub

## Project Structure

```
src/main/java/com/project
│
├── controller      → REST Controllers
├── service         → Business logic
├── repository      → JPA repositories
├── entity          → Database entities
├── dto             → Data Transfer Objects
├── exception       → Custom exceptions
└── config          → Configuration classes
```

## API Examples

### Create User

POST /users

### Get All Users

GET /users

### Get User By Id

GET /users/{id}

### Update User

PUT /users/{id}

### Delete User

DELETE /users/{id}

### Search User By Email

GET /users/search?keyword=test

## Learning Outcomes

Through this project I learned:

* How REST APIs work in real projects
* How to design layered architecture
* How to write clean service logic
* How pagination works in backend systems
* How to write custom queries using JPA
* How to structure production-style backend projects

## Future Improvements

* Spring Security (JWT Authentication)
* Role based authorization
* Swagger Documentation
* Docker deployment
* Unit testing (JUnit + Mockito)
* Microservices conversion

## Author

Java Backend Developer (Learning Phase)

## How to Run Project

1 Clone repository

```
git clone <your repo url>
```

2 Open in IntelliJ / Eclipse

3 Configure database in application.properties

4 Run Spring Boot application

5 Test APIs using Postman

## Status

In Progress – Adding more real world backend features.
