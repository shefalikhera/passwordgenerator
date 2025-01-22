# Password Generator and Strength Checker

## Overview

Password Generator and Strength Checker is a Java-based application designed to help users generate secure passwords based on customizable criteria and assess their strength. Users can save their preferred password to a file for future use, ensuring a streamlined and secure workflow.

## Features

### Password Generation:
- Users can choose to include:
  - Uppercase letters
  - Lowercase letters
  - Numbers
  - Symbols
- Users specify the desired password length.
- Randomly generates passwords based on user preferences.

### Password Strength Assessment:
- Evaluates password strength based on:
  - Inclusion of uppercase and lowercase letters.
  - Presence of numbers and symbols.
  - Password length.
- Strength levels: Weak, Medium, Strong, Very Strong.

### File Storage:
- Allows users to save the generated password to a specified file.
- Stores the password securely in plain text format for ease of retrieval.

## Installation

### Requirements:
- Java Development Kit (JDK) 8 or above.
- Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or VS Code.

### Setup:
1. Copy the provided source code into your IDE.
2. Compile and run the program.

## Code Structure

### Main Class:
`Pswd`: Entry point of the application. Handles user input and invokes password generation, evaluation, and file storage methods.

### Methods:
- `generatePassword`: Creates a password based on user-specified criteria.
- `evaluateStrength`: Analyzes the generated password and assigns a strength level.
- `savePasswordToFile`: Saves the selected password to a user-specified file.

### Workflow:
1. User specifies criteria for password generation.
2. Program generates three passwords and displays their strength.
3. User selects a password to save to a file.

## Usage

### Run the Program:
Execute the `Pswd` class in your IDE.

### Generate Passwords:
1. Specify whether to include uppercase letters, lowercase letters, numbers, and symbols.
2. Enter the desired password length.

### View Strength:
- Program evaluates and displays the strength of generated passwords.

### Save Password:
1. Choose a password to save.
2. Enter the filename to store the password.

## Sample Output

### Initial Input
```
Welcome to Password Generator and Strength Checker!
Do you want to include uppercase letters? (yes/no): yes
Do you want to include lowercase letters? (yes/no): yes
Do you want to include numbers? (yes/no): yes
Do you want to include symbols? (yes/no): no
What length do you want the password to be?: 12
Enter the name of the file where you want to store the passwords: passwords
```

### Password Generation
```
Password 1: Abc123xyzDEF
Strength: Strong
Password 2: Xyz789abcGHI
Strength: Strong
Password 3: Pqr456jklLMN
Strength: Strong
```

### Save Password
```
Choose one password to add to the file (Enter 1, 2, or 3): 2
The password has been stored in passwords.txt successfully.
```

## Contributors
Shefali Khera

## Notes
- Ensure valid input for character inclusion preferences (yes/no).
- Passwords are generated randomly and may differ for identical inputs.
- Strength evaluation considers length and character variety for security.

