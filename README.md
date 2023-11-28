# Banking Application Backend

<br>

## Overview

Welcome to the backend repository of our Banking Application developed in Java with Spring Boot! This repository contains the server-side code that powers the core functionalities of our banking system. The application is designed to handle various banking operations, including account creation, login, authentication, debit, credit, transfer, email alerts, and generating banking statements in PDF format.

<br>

## Table of Contents

- [Getting Started](#getting-started)
- [Features](#features)
- [Dependencies](#dependencies)
- [Installation](#installation)
- [Database](#database)
- [Usage](#usage)
- [API Documentation](#api-documentation)

<br>

## Getting Started

To get started with the backend of our Banking Application, follow these steps:

1. Clone this repository to your local machine.
2. Install the necessary dependencies (see [Dependencies](#dependencies)).
3. Configure the application (see [Configuration](#configuration)).
4. Run the application using the provided scripts or your preferred method.

<br>

## Features

- **Account Creation, Login & Authentication**: Secure user account creation, login, and authentication with JWT tokens.
- **Debit, Credit, Transfer**: Perform various transactions, including debit, credit, and transfers between user accounts.
- **Email Service with Alerts**: Send email alerts for transactions and login attempts.
- **Generated Banking Statement to PDF**: Generate a PDF banking statement with details of every transaction.

<br>

## Dependencies

The following dependencies are required to run the backend:

- Java
- Spring Boot
- Spring Security
- iText (for PDF generation)
- Other dependencies as specified in the `pom.xml` file.

<br>

## Installation

1. Ensure that Java and Maven are installed on your machine.
2. Clone this repository:

   ```bash
   git clone https://github.com/your-username/banking-app-backend.git

3. Build the project

   ```bash
   cd banking-app-backend
   mvn clean install

<br>

## Database

The backend of our Banking Application uses the H2 Database for local development. However, you can easily swap it for any SQL or other databases of your choice.

### Database - Configuration

The database configuration is specified in the `application.properties` file. You can customize the settings based on your database preferences:

```properties```
# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:bankingdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Hibernate Configuration
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update



<br>

## Usage

Run the application using:

   ```bash
   mvn spring-boot:run
   ```

The server will be running at http://localhost:8080 by default. You can change the port and other configurations in the application.properties file.

<br>

## API Documentation

### POST

- **Create New User**

  ```POST
  http://localhost:8080/api/user

- **Credit User Account**

  ```POST
  http://localhost:8080/api/user/credit

- **Debit User Account**

  ```POST
  http://localhost:8080/api/user/debit

- **Transfer Between Accounts**

  ```POST
  http://localhost:8080/api/user/transfer

- **Login**

  ```POST
  http://localhost:8080/api/user/login

<br>

### GET

- **Name Enquiry**

  ```GET
  http://localhost:8080/api/user/nameEnquiry

- **Balance Enquiry**

  ```GET
  http://localhost:8080/api/user/balanceEnquiry

- **Generate Bank Statement**

  ```GET
  http://localhost:8080/bankStatement

