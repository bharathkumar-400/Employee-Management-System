# Employee Management System

A Spring Boot-based Employee Management System designed to manage employees securely with user registration, OTP verification, authentication, and role-based access control.

> **Project Status:** 🚧 Currently under development

## 📌 Project Overview

The Employee Management System is a backend-focused web application developed using **Java and Spring Boot**.

The application provides secure user registration and authentication features and allows different users to access functionality based on their assigned roles.

The project is being developed incrementally, with additional employee management and security features planned for future releases.

## 🚀 Current Features

* User registration
* Email OTP verification
* User authentication
* Role-based access control
* Employee management APIs
* RESTful APIs
* MySQL database integration
* Spring Data JPA
* Spring Security
* Password handling and authentication
* Layered architecture using Controller, Service, Repository, and Entity layers

## 🛠️ Technologies Used

### Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* REST APIs

### Database

* MySQL

### Build Tool

* Maven

### Development Tools

* Eclipse / IntelliJ IDEA
* Postman
* Git
* GitHub

## 🏗️ Project Structure

```text
src
└── main
    ├── java
    │   └── com.spring.employee_management_system
    │       ├── config
    │       ├── controller
    │       ├── dto
    │       ├── entity
    │       ├── repository
    │       ├── service
    │       └── util
    │
    └── resources
        └── application.properties
```

## 🔐 Authentication & Authorization

The application uses **Spring Security** to secure application endpoints.

The authentication flow includes:

```text
User Registration
       ↓
OTP Verification
       ↓
Authentication
       ↓
Role Verification
       ↓
Authorized Access
```

Different roles can be given different levels of access to application resources.

## 📧 OTP Verification

During registration, an OTP is generated and sent to the user's registered email address.

The user must verify the OTP before completing the registration process.

```text
Enter Registration Details
          ↓
       Generate OTP
          ↓
     Send OTP by Email
          ↓
     Enter OTP
          ↓
    Verify OTP
          ↓
 Registration Completed
```

## 👨‍💼 Employee Management

The application provides APIs for employee-related operations.

Planned and existing functionality includes:

* Add employee
* View employee
* Update employee
* Delete employee
* Manage employee information

Additional functionality will be added as development continues.

## 🔄 Development Workflow

This project is developed using Git and GitHub for version control.

```text
Develop Feature
      ↓
   git status
      ↓
    git add .
      ↓
   git commit
      ↓
    git push
      ↓
    GitHub
```

## 🔮 Future Improvements

The following features are planned for future versions:

* JWT-based authentication
* Improved role and permission management
* Global exception handling
* Input validation
* Pagination and sorting
* Employee search and filtering
* API documentation using Swagger/OpenAPI
* Improved email notification system
* Admin dashboard
* Improved logging and monitoring
* Unit and integration testing
* Docker support

## ▶️ How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/bharathkumar-400/Employee-Management-System.git
```

### 2. Open the project

Open the project in Eclipse, IntelliJ IDEA, or another Java IDE.

### 3. Configure MySQL

Create/configure the required MySQL database and update the database configuration in:

```text
src/main/resources/application.properties
```

### 4. Build the project

Using Maven:

```bash
mvn clean install
```

### 5. Run the application

Run the Spring Boot main class:

```text
EmployeeManagementSystemApplication
```

The application will start on the configured server port.

## 🧪 Testing APIs

The REST APIs can be tested using **Postman**.

Example operations include:

```text
POST   /register
POST   /verify-otp
POST   /login
GET    /employees
POST   /employees
PUT    /employees/{id}
DELETE /employees/{id}
```

> API endpoints may change as the project continues to develop.

## 👨‍💻 Developer

**Bharath Kumar P R**

Java Full Stack Developer | Spring Boot | REST APIs | MySQL

GitHub:
https://github.com/bharathkumar-400

LinkedIn:
https://linkedin.com/in/bharathkumarpr17

## 📄 License

This project is currently developed for learning and portfolio purposes.
