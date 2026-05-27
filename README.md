# Flashcards App

A full-stack flashcards application built with Spring Boot and PostgreSQL.

-----------------

##  Live Demo
https://flashcards-app-jzdk.onrender.com

-----------------

## Features

- User signup/login
- Add flashcards (front & back information)
- Practice mode with flip animation
- Mark correct / incorrect
- Skip flashcards
- Timer with progress bar
- Persistent storage using PostgreSQL
- User friendly UI

-----------------

## Tech Stack

**Backend:**
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL

**Frontend:**
- HTML
- CSS
- JavaScript

**Deployment:**
- Docker
- Render

------------------

## API Endpoints

- POST `/users/signup`
- POST `/users/login`
- POST `/words`
- GET `/words`
- GET `/words/random`
- DELETE `/words/{id}`

-------------------

## Run Locally

```bash
./mvnw spring-boot:run