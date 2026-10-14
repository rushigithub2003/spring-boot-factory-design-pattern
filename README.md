# Spring Boot Factory Design Pattern

A simple Spring Boot REST API demonstrating the **Factory Design Pattern** in Java.

The application creates document service objects based on the document type provided in an HTTP request. It supports PDF, Excel, and Word document services.

## Features

- Demonstrates the Factory Design Pattern.
- Uses a common `DocumentService` interface.
- Supports PDF, Excel, and Word service implementations.
- Exposes REST endpoints using Spring Boot.
- Demonstrates object creation and method execution through a common interface.
- Includes basic handling for unsupported document types.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- REST API
- Factory Design Pattern

## Project Structure

```text
src/main/java/com/example/demo/
├── controller/
│   └── DocumentController.java
├── factory/
│   └── Factory.java
└── service/
    ├── DocumentService.java
    ├── PdfDocumentServiceImpl.java
    ├── ExcelDocumentServiceImpl.java
    └── WordDocumentServiceImpl.java
```

## API Endpoints

| Method | Endpoint       | Description                |
| ------ | -------------- | -------------------------- |
| GET    | `/print/pdf`   | Executes the PDF service   |
| GET    | `/print/excel` | Executes the Excel service |
| GET    | `/print/word`  | Executes the Word service  |

### Example Request

```http
GET http://localhost:8080/print/pdf
```

### Example Response

```text
PDF
```

The application also logs the data-reading, processing, and printing operations to the console.

## How It Works

1. The client sends a request specifying the document type.
2. `DocumentController` receives the request.
3. `Factory` selects and creates the appropriate `DocumentService` implementation.
4. The controller invokes `readData()`, `processData()`, and `printData()`.
5. The API returns the result from the selected service.

## Learning Objectives

- Understand the Factory Design Pattern.
- Practice interfaces and implementation classes in Java.
- Understand object creation through a factory.
- Apply object-oriented programming principles.
- Build REST endpoints using Spring Boot.

## Running the Project

1. Clone the repository.
2. Open the project in Spring Tool Suite, IntelliJ IDEA, or another compatible Java IDE.
3. Ensure that the required Java and Maven versions are installed.
4. Run the Spring Boot application.
5. Test the endpoints using Postman or a browser.

## Future Improvements

- Add unit tests for the factory and document services.
- Improve exception handling and request validation.
- Introduce Spring-managed service beans and dependency injection.
- Add logging and API documentation.
- Implement actual document generation.
