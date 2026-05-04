# Fintech Order Microservice
A robust Spring Boot 3.4.2 service integrated with a Supabase cloud database.

## Key Features
- **Input Validation**: Strict checks for email formats and transaction amounts.
- **Global Exception Handling**: Custom JSON error messages for API failures.
- **Security**: Database credentials managed via environment variables.
- **Interactive Documentation**: Built-in Swagger UI for real-time API testing.

## How to Run Locally
1. Clone the repository.
2. Set an environment variable `DB_PASSWORD` with your Supabase database password.
3. Run the application via IntelliJ or `./mvnw spring-boot:run`.
4. Access **Swagger UI** at: `http://localhost:8080/swagger-ui/index.html`
