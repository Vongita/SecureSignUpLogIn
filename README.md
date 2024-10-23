# Login and Sign-Up Form (No Database)

## Project Overview

This project is a simple **Java Swing** application that allows users to sign up and log in using a graphical user interface (GUI). It does not use a database; instead, user credentials (username and password) are stored temporarily in memory using a `HashMap`. The project demonstrates the basics of user authentication using Java Swing for the frontend and a simple in-memory storage for user data.

## Features

- **Sign-Up**: Allows new users to create an account by entering a username and password.
- **Login**: Existing users can log in with their username and password.
- **Session Management**: After a successful login, users are redirected to a simple dashboard displaying a welcome message.
- **No Database Required**: User credentials are stored in memory (using a `HashMap`), making this project suitable for small-scale applications or testing environments.

## Technologies Used

- **Java**: The core programming language used.
- **Java Swing**: To create the graphical user interface (GUI) for the sign-up and login forms.
- **HashMap**: To temporarily store user data in memory.

## How It Works

1. **Sign Up**:  
   - The user enters a username and password.
   - If the username does not already exist in the system, the user's details are stored in memory.
   - The user is notified of a successful sign-up.

2. **Login**:  
   - The user enters their registered username and password.
   - The credentials are validated against the in-memory stored data.
   - If the login is successful, the user is redirected to the dashboard.

3. **Dashboard**:  
   - After successful login, a welcome message is displayed with the user's username.

4. **Error Handling**:  
   - Displays an error message if the username already exists during sign-up.
   - Displays an error message if the credentials are invalid during login.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- IntelliJ IDEA or any Java IDE.
- Basic knowledge of Java and Java Swing.

## How to Run the Project

1. Clone the repository or download the source code.
2. Open the project in IntelliJ IDEA (or your preferred IDE).
3. Compile and run the `LoginSignUpApp.java` file.
4. The sign-up form will appear first. Enter a username and password to create a new account.
5. Switch to the login form and enter your credentials to log in.
6. Upon successful login, a dashboard window will appear with a welcome message.

## Project Structure


## Limitations

- This project does not persist user data. Once the application is closed, all user data will be lost.
- There is no password encryption. In a production environment, it is recommended to hash passwords using a secure algorithm like bcrypt or SHA-256.
- This project is meant for demonstration purposes and should not be used for real-world applications without further enhancements.

## Possible Improvements

- Implement password hashing for added security.
- Add a feature for password validation (e.g., minimum length, complexity).
- Persist user data using a database (e.g., MySQL, SQLite).
- Implement session timeout for better session management.
- Add more UI components and user feedback mechanisms.

## License

This project is licensed under the MIT License. Feel free to use, modify, and distribute the code as you see fit.

