
# 🛠️ Skill Tracker API

The **Skill Tracker API** is a Spring Boot-based RESTful backend application that allows users to perform CRUD operations on a collection of skills. It uses Spring MVC architecture and supports validation, exception handling, and secured endpoints using Spring Security (Basic Auth).

---

## 📌 Features

✅ Full CRUD operations  
✅ Spring MVC layered architecture  
✅ Spring Boot REST APIs  
✅ MySQL Database Integration  
✅ Spring Security - Basic Authentication  
✅ Data validation with clear error messages  
✅ Global Exception Handling  
✅ DTO Pattern for request/response isolation

---

## 📂 Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Web (MVC)
- Spring Data JPA
- Spring Security (Basic Auth)
- MySQL Database
- Jakarta Bean Validation (`@Valid`)
- Maven

---

## 🔐 Security Configuration

This project is protected using **Spring Security with Basic Authentication**.

| Username | Password    | Role  |
|----------|-------------|-------|
| admin    | admin123    | ADMIN |

All endpoints under `/api/**` require authentication.

---

## 📁 Folder Structure

skill-tracker-api/
├── controller/
├── dto/
├── entity/
├── exception/
├── repository/
├── security/
├── service/
└── SkillTrackerApplication.java

yaml
Copy code

---

## 📦 API Endpoints

| Method | Endpoint            | Description         | Auth Required |
|--------|---------------------|---------------------|----------------|
| POST   | /api/skills         | Add new skill       | ✅ Yes         |
| GET    | /api/skills         | Get all skills      | ✅ Yes         |
| PUT    | /api/skills/{id}    | Update skill        | ✅ Yes         |
| DELETE | /api/skills/{id}    | Delete skill        | ✅ Yes         |

---

## 🧪 Validation Rules

| Field   | Rules                                 |
|---------|----------------------------------------|
| name    | Required, non-empty string            |
| domain  | Required, non-empty string            |
| level   | Integer, must be between 1 and 10     |
| email   | Required, valid email format          |

---

### 🛑 Sample Validation Error Response

```json
{
  "email": "Invalid email format",
  "name": "Name is required"
}
```
