# Student Portal - Test Automation Suite

# Project Structure

student-portal-tests/
├── src/test/java/com/mathworks/tests/
│   ├── LoginTest.java
│   ├── SessionTimeoutTest.java
│   └── MongoDBValidationTest.java
├── pom.xml
└── .github/workflows/java-tests.yml


# Overview

This project is a test automation framework built using **Java**, **JUnit 5**, **Selenium WebDriver**, and **MongoDB**.  
It simulates UI testing and backend validation for a university student portal (login, session handling, data verification).

The suite is designed with clean test architecture and integrates with **GitHub Actions** for CI/CD execution on every push.

---

# Tech Stack
- Java 17
- Maven
- Selenium WebDriver
- JUnit 5
- MongoDB Driver
- GitHub Actions (CI/CD)

---

# Test Coverage
| Test Suite                 | Description                                                  |
|---------------------------|--------------------------------------------------------------|
| `LoginTest`               | Tests login with valid credentials                           |
| `SessionTimeoutTest`      | Simulates inactivity and verifies session expiry             |
| `MongoDBValidationTest`   | Connects to MongoDB and verifies student record consistency  |

---

# Setup & Run
# Prerequisites
- Java 17+
- Maven
- Chrome browser
- Local MongoDB (or mock connection for test)

# Run Tests Locally
```bash
# Clone the repo
git clone https://github.com/your-username/student-portal-tests.git
cd student-portal-tests

# Run tests

mvn test
