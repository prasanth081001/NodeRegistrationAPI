Node Registration API

Project Overview

This project is a Spring Boot REST API used to register monitoring nodes and store node details in a MySQL database.

Technology Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

Features

- Register monitoring nodes
- Save node details into database
- REST API integration
- Clean package structure

Entity Fields

- id
- nodeName
- ipAddress
- status
- createdAt

API Endpoint

Register Node

POST "/api/nodes/register"

Sample Request Body

{
  "nodeName": "Server-1",
  "ipAddress": "192.168.1.10",
  "status": "ACTIVE"
}

Success Response

Success

Database Configuration

Update "application.properties" with your MySQL username and password.

Run Project

1. Open in IntelliJ IDEA
2. Configure MySQL database
3. Run Spring Boot application
4. Test API in Postman
