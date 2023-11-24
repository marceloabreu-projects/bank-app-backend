# Banking Application Backend

## Overview

Welcome to the backend repository of our Banking Application developed in Java with Spring Boot! This repository contains the server-side code that powers the core functionalities of our banking system. The application is designed to handle various banking operations, including account creation, login, authentication, debit, credit, transfer, email alerts, and generating banking statements in PDF format.

## Table of Contents

- [Getting Started](#getting-started)
- [Features](#features)
- [Dependencies](#dependencies)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Documentation](#api-documentation)

## Getting Started

To get started with the backend of our Banking Application, follow these steps:

1. Clone this repository to your local machine.
2. Install the necessary dependencies (see [Dependencies](#dependencies)).
3. Configure the application (see [Configuration](#configuration)).
4. Run the application using the provided scripts or your preferred method.

## Features

- **Account Creation, Login & Authentication**: Secure user account creation, login, and authentication with JWT tokens.
- **Debit, Credit, Transfer**: Perform various transactions, including debit, credit, and transfers between user accounts.
- **Email Service with Alerts**: Send email alerts for transactions and login attempts.
- **Generated Banking Statement to PDF**: Generate a PDF banking statement with details of every transaction.

## Dependencies

The following dependencies are required to run the backend:

- Java
- Spring Boot
- Spring Security
- iText (for PDF generation)
- Other dependencies as specified in the `pom.xml` file.

## Installation

1. Ensure that Java and Maven are installed on your machine.
2. Clone this repository:

   ```bash
   git clone https://github.com/your-username/banking-app-backend.git

3. Build the project

   ```bash
   cd banking-app-backend
   mvn clean install
  
## Configuration

Configuration files are located in the `src/main/resources` directory. Customize the configuration according to your environment:

- `application.properties`: Default configuration.

## Usage

Run the application using:

   ```bash
   mvn spring-boot:run
   ```

The server will be running at http://localhost:8080 by default. You can change the port and other configurations in the application.properties file.
