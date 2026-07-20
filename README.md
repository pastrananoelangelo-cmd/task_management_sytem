# Task Management System API

> A Spring Boot backend project built to learn modern Java backend development through real-world software engineering principles.

---

## Overview

The **Task Management System API** is a RESTful backend application that allows users to manage their daily tasks. While the application itself is intentionally simple, its primary goal is to provide hands-on experience with the technologies and architectural patterns commonly used in Java backend development.

Rather than following tutorials blindly, this project focuses on understanding **why** each component exists and how they work together to build maintainable software.

This project marks my transition from learning Java fundamentals and Data Structures & Algorithms to building real backend applications using the Spring Boot ecosystem.

---

# Project Goals

* Learn Spring Boot from the ground up
* Understand REST API development
* Learn layered architecture
* Design maintainable backend applications
* Practice Object-Oriented Programming in a real project
* Learn database integration using JPA/Hibernate
* Understand dependency injection
* Build software that can continuously evolve with new features

---

# Functional Requirements

Version **1.0** focuses on the core features of task management.

Users should be able to:

* Create tasks
* Read all tasks
* Read a specific task
* Update existing tasks
* Delete tasks
* View task priority
* View task status
* View creation date
* View last updated date
* View task deadline

---

# Task Entity

Each task contains the following information:

| Field       | Description                 |
| ----------- | --------------------------- |
| id          | Unique identifier           |
| title       | Task title                  |
| description | Task description            |
| priority    | LOW, MEDIUM, HIGH           |
| status      | TODO, IN_PROGRESS, DONE     |
| deadline    | Due date                    |
| createdAt   | Task creation timestamp     |
| updatedAt   | Last modification timestamp |

---

# Priority vs Status

One important design decision is separating **Priority** from **Status**.

### Priority

Represents how important the task is.

```
LOW
MEDIUM
HIGH
```

### Status

Represents the current progress.

```
TODO
IN_PROGRESS
DONE
```

Example:

```
Task:
Finish Spring Boot Project

Priority:
HIGH

Status:
IN_PROGRESS
```

---

# REST API Endpoints

| Method | Endpoint    | Description        |
| ------ | ----------- | ------------------ |
| POST   | /tasks      | Create a task      |
| GET    | /tasks      | Retrieve all tasks |
| GET    | /tasks/{id} | Retrieve one task  |
| PUT    | /tasks/{id} | Update a task      |
| DELETE | /tasks/{id} | Delete a task      |

These endpoints follow RESTful design principles and provide the application's CRUD functionality.

---

# Planned Architecture

The application follows a layered architecture.

```
Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
Database
```

Each layer has a single responsibility.

## Controller

* Receives HTTP requests
* Returns HTTP responses
* Delegates business logic to the Service layer

---

## Service

* Contains business logic
* Validates application rules
* Coordinates between Controller and Repository

---

## Repository

* Handles database operations
* Saves, retrieves, updates, and deletes entities
* Uses Spring Data JPA

---

## Database

Stores application data.

Initially, the project revolves around a single entity:

```
Task
```

Future versions will introduce additional entities.

---

# Project Structure

```
src
│
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
├── config
├── mapper
└── TaskManagementApplication.java
```

This structure promotes separation of concerns and improves maintainability.

---

# Development Roadmap

## Version 1.0

Core Features

* CRUD Operations
* Spring Boot setup
* REST API
* JPA/Hibernate
* Database integration
* Validation
* Exception handling

---

## Version 1.1

Enhanced Task Management

* Search tasks
* Filter by priority
* Filter by status
* Sorting
* Improved API responses

---

## Version 1.2

User Management

* User accounts
* Authentication
* Authorization
* JWT Security

---

## Version 2.0

Advanced Features

* Categories
* Statistics dashboard
* Task dependencies
* Notifications
* File attachments

---

# Learning Objectives

This project is designed to answer questions such as:

* Why do we use Controllers?
* Why separate the Service layer?
* Why use Repositories?
* What is Dependency Injection?
* Why use JPA instead of writing SQL everywhere?
* Why does layered architecture make applications easier to maintain?
* How does a client communicate with a backend server?
* How does data flow through a Spring Boot application?

Understanding these concepts is considered more important than simply making the application work.

---

# Technologies

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* REST API
* MySQL (or PostgreSQL)
* Postman (API Testing)

---

# Future Improvements

As my knowledge grows, this project will continue to evolve.

Possible future additions include:

* User authentication
* Role-based authorization
* Task categories
* Pagination
* Search optimization
* Docker deployment
* Unit and integration testing
* CI/CD
* Cloud deployment
* Graph-based task dependencies

---

# Philosophy

This project is built with one guiding principle:

> **Understand the "why" before the "how."**

The goal is not only to learn Spring Boot, but also to understand the engineering principles behind modern backend development.

Like my previous learning projects, this application emphasizes building knowledge from first principles rather than relying solely on frameworks or tutorials.
"# task_management_sytem" 
