# 🌍 NGO Connect – Setup Guide

This document explains how to set up and run the *NGO Connect App (Full-Stack Java + React)* on your local system from scratch.

---

## 📖 Overview

The NGO Connect App helps manage NGO data, volunteers, donations, and activities efficiently.  
This project includes:
- Backend: Spring Boot (Java + Maven)
- Frontend: React (JavaScript)
- Database: MySQL

---

## 🧰 Tech Stack

| Layer | Technology |
|-------|-------------|
| Frontend | React.js, HTML, CSS,JavaScript  |
| Backend | Spring Boot (Java), Maven |
| Database | MySQL |
| Tools | VS Code, MySQL Workbench |

---

## ⚙ Backend Setup

1. *Open Folder*  
   Open NGO Connect Backend .

2. *Install Java & Maven*
   - [Download Java JDK 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
   - [Download Maven](https://maven.apache.org/download.cgi)
   - Verify:
     bash
     java -version
     mvn -v
     

3. *Set up MySQL Database*
   - Install [MySQL Community Server](https://dev.mysql.com/downloads/)
   - Open MySQL Workbench
   - Create database:
     sql
     CREATE DATABASE ngo_connect;
     

4. **Update application.properties**
   Open src/main/resources/application.properties and edit:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ngo_connect
   spring.datasource.username=root
   spring.datasource.password=pass123
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

Navigate to backend directory and run the project:
cd ngo-connect-backend
bash
mvn clean install
mvn spring-boot:run
The backend server will start on the default port 8080.
Ensure MySQL is running before executing this command.

## 💻 Frontend Setup (React)

Navigate to the frontend folder, install dependencies, and start the development server:

bash
cd ngo-react-frontend
npm install
npm start
The Frontend will start on http://localhost:3000/ by default

🔗 Default URLs
Service URL
Backend(Spring Boot) : http://localhost:8080/
Test in browser or postman : http://localhost:8080/api/ngos

Frontend (React) : https://localhost:3000/

## 👩‍💻 Contributors

