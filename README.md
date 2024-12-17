# Custom LoggingFilter for Request and Response Logging

### Overview
This project implements a custom LoggingFilter in a Spring Boot application. The filter is used to log details of incoming HTTP requests and outgoing HTTP responses. 

### Features
•	Logs all incoming HTTP requests with key details such as method, URI, headers, and request body.
•	Logs all outgoing HTTP responses with status codes, headers, response body, and processing time.

### Testing
POST /auth/signup
![image](https://github.com/user-attachments/assets/5ed8a279-e558-494e-9b32-411e8212d990)

POST /auth/login
![image](https://github.com/user-attachments/assets/fa3f94cc-f4ad-4623-996f-84fe4f3de72d)


# Session Management

### Features:
Implement a SessionEntity table to maintain only one active session per user. When a user logs in:
1.	Remove the previous session token (if it exists).
2.	Create and store a new session token in the database.
3.	Validate tokens using a database lookup to ensure active sessions.

### Testing

POST /auth/login
Logging in user and creating a session

![image](https://github.com/user-attachments/assets/d94f92b8-41cb-4a97-a0a7-2e4a346247a1)


GET /auth/validate
Validates present session

![image](https://github.com/user-attachments/assets/40c68403-e7ff-47f0-827c-c315c8e660f2)

POST /auth/logout
Log out user(session removal)

![image](https://github.com/user-attachments/assets/055850a0-e83b-4f15-af6f-ad30159976e3)

![image](https://github.com/user-attachments/assets/bd10a481-998b-4c4d-9f26-9910c1cc4bd8)






