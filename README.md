# Server Management Web Application

This README provides instructions for setting up and using the Server Management Web Application. This application allows you to perform CRUD (Create, Read, Update, Delete) operations on server records stored in a MongoDB database through a user-friendly web interface.

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Directory Structure](#directory-structure)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Server Management Web Application is a basic web-based frontend for managing server records. It supports the following operations:

- Create a new server.
- View a list of servers.
- Edit server details.
- View server details.
- Delete servers.

This application is built using Java, Spring Boot, Thymeleaf for UI rendering, and MongoDB for data storage.

## Prerequisites

Before you begin, make sure you have the following prerequisites installed on your system:

- Java Development Kit (JDK)
- Maven
- MongoDB
- Spring Boot
- Thymeleaf (for UI)

## Installation

Follow these steps to set up and run the Server Management Web Application:

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/sjarunvenkat/server-management-web.git
   ```

2. Navigate to the project directory:

   ```shell
   cd server-management-web
   ```

3. Build the project using Maven:

   ```shell
   mvn clean install
   ```

4. Start the application:

   ```shell
   mvn spring-boot:run
   ```

The application will start and be accessible at `http://localhost:6039/servers/`.

## Usage

1. Access the application by opening a web browser and navigating to `http://localhost:6039/servers/`.

    ![3 1](https://github.com/sjarunvenkat/server-management-web/assets/73863663/3a91b089-b3a7-4f3b-b5cf-a95a6e3e746a)

2. Use the web interface to perform various operations:

   - **Create a Server**: Fill out the "Create Server" form to add a new server record to the database.

   - **View Servers**: The list of servers is displayed on the main page. Click "View" to see the details of a specific server.

     ![3 2](https://github.com/sjarunvenkat/server-management-web/assets/73863663/0d27f6f0-50a1-4312-b84d-6d879e15c876)

   - **Edit Servers**: Click "Edit" on a server's row to edit its details. You can update the server's name, language, and framework.

     ![3 3](https://github.com/sjarunvenkat/server-management-web/assets/73863663/3a278dab-a4ba-40f4-83cd-70c890aa722a)

   - **Delete Servers**: Click "Delete" on a server's row to delete it from the database.

     ![3 4](https://github.com/sjarunvenkat/server-management-web/assets/73863663/2994d316-9f09-4235-b4c5-bdb3f1085279)

## Directory Structure

The project directory is organized as follows:

- `src/main/java/com/example/mongoserver/`: Java source code.
- `src/main/resources/`: Configuration files and Thymeleaf templates.
- `pom.xml`: Maven project configuration.

## Contributing

Contributions to this project are welcome. If you find any issues or have ideas for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Thank you for using the Server Management Web Application! I hope this README helps you set up and use the application effectively. If you have any questions or encounter issues, please don't hesitate to reach out for assistance.
