# Acme Corp Backend API
## Project Overview
Welcome to the Acme Corp Backend API. This API is developed to manage the products in our supply chain management software. It provides methods to create, retrieve, filter, and sort products. This README file contains instructions on how to set up and use the API.

## Features
- **Product Management**: Create, read, sort, and filter products.
- **Comprehensive Error Handling**: Return appropriate HTTP statuses and messages for different scenarios.
- **API Documentation**: Detailed API specification using Swagger/OpenAPI.

## Task Overview
The Senior Back-End Developer at Acme Corp is looking for an intern to help with the development of new API features. As part of your test assignment, you will need to complete the following tasks:

1. Develop an API method to create a new product:
    - Define a data model for a product, including fields such as name, description, price, category, and so on.
    - Create an API method (POST /products) that accepts a JSON object with product data and saves it to the database.
    - Return a JSON object with information about the created product.
2. Develop an API method to get a list of products:
    - Create an API method (GET /products) that returns a list of all products from the database.
    - Add the ability to filter products by category (use the GET /products?category= parameter).
    - Add the ability to sort products by price (use the GET /products?sort=price parameter).
3. Develop an API method to get information about a specific product:
    - Create an API method (GET /products/:id) that takes a product ID and returns information about it.
    - Handle a 404 error if the product with the specified ID is not found.

## Requirements
- Experience in developing with Python or Java (of your choice)
- Knowledge of OOP
- Knowledge of SQL
- Experience working with APIs
- Ability to write clean and readable code

## Technologies Used

- Java
- Spring
- Spring boot
- Spring data jpa
- Spring web services
- Postgresql
- Maven
- LomBok

## Getting Started

1. Clone the repository: `git clone <repository-url>`
2. Build the project: `mvn clean package`
3. Go to application.properties and do some change:
4. change `spring.datasource.url=jdbc:postgresql://localhost:5432/task5` to your own database url
5. change `spring.datasource.username=postgres` to your username
6. change `.datasource.password=57206700` to your password
7. Run the application

## Usage
- Use API endpoints to interact with the system programmatically.
 

## API Endpoints
### endpoints to manage product entity
![image](https://github.com/b410asakura/final-task/assets/73512839/6de825ee-597b-409f-af6d-fcab868d6997)


## Video Demonstration

Video demonstration of the API in action can be found [here](https://drive.google.com/file/d/1nC7e-JlS46T9RceEIUyO3mxOWGhHw41a/view?usp=sharing)

Video record of all work can be found [here](https://drive.google.com/file/d/10TbbaoJcH1b19_LmDmj-FRMovoc4BcbH/view?usp=sharing)
