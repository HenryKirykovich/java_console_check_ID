# User ID Validation Program (Java)

This Java program allows the user to create and validate a custom user ID based on specific security requirements. It checks the entered ID against multiple rules to ensure it meets defined standards, such as length limits, digit and special character inclusion, and character formatting.

## Features

- Prompts the user to define minimum and maximum ID length.
- Repeatedly asks the user to enter a valid ID until all conditions are satisfied.
- Validates that:
  - The ID is within the specified length range.
  - The first character is a letter.
  - The ID contains **at least two digits**.
  - The **first and last characters** are the same.
  - The ID contains **at least two special characters** (non-alphanumeric), which must **not be consecutive**.

## Example Usage

Put your min length of ID number
5
Put your max length of ID number
10
Put your ID number
a1#2#1a



If the ID fails any rule, the program provides specific feedback and prompts for a new entry.

## How to Run

1. Save the file as `Creat_new_user_check_req.java`.
2. Compile the program:
   ```bash
   javac Creat_new_user_check_req.java
If the ID fails any rule, the program provides specific feedback and prompts for a new entry.

## How to Run

1. Save the file as `Creat_new_user_check_req.java`.
2. Compile the program:
   ```bash
   javac Creat_new_user_check_req.java
Run the program:

bash
Copy
Edit
java Creat_new_user_check_req
Requirements
Java Development Kit (JDK) 8 or later.

Educational Purpose
Created as part of CS 210 coursework at Bellevue College by Henadzi Kirykovich (May 2025), this project demonstrates the use of:

Loops

Methods

String parsing

Character classification (Character class)

Input validation logic

go
Copy
Edit
