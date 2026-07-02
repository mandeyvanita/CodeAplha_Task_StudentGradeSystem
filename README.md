# CodeAplha_Task_StudentGradeSystem
A Java-based Student Grade Tracking System that allows users to add student records, manage marks, calculate grades, generate reports, and store data using Object-Oriented Programming and File Handling.
# 🎓 Student Grade Tracker

A simple Java console-based application that helps manage student grades. This project allows users to enter student details, calculate the average marks, identify the highest and lowest scores, and display a summary report.

## 📌 Features

- Add student details
- Store student name and marks
- Calculate average marks
- Find highest marks
- Find lowest marks
- Display student report
- Console-based interface
- Object-Oriented Programming (OOP)

## 🛠️ Technologies Used

- Java
- VS Code
- JDK 17+
- Console Application

## 📂 Project Structure

```
StudentGradeTracker/
│
├── src/
│   ├── Main.java
│   ├── Student.java
│   └── GradeManager.java
│
├── README.md
└── .gitignore
```

## 🚀 How to Run

### Step 1
Open the project in VS Code.

### Step 2
Open Terminal.

### Step 3
Go to src folder.

```
cd src
```

### Step 4
Compile the project.

```
javac *.java
```

### Step 5
Run the program.

```
java Main
```

## 💻 Sample Output

```
===== Student Grade Tracker =====

Enter number of students: 3

Student 1
Enter Name: Rahul
Enter Marks: 85

Student 2
Enter Name: Priya
Enter Marks: 92

Student 3
Enter Name: Aman
Enter Marks: 76

========== STUDENT REPORT ==========
Name                 Marks
Rahul                85
Priya                92
Aman                 76
------------------------------------
Average Marks : 84.33
Highest Marks : 92 (Priya)
Lowest Marks  : 76 (Aman)
```

## 📖 Concepts Used

- Classes and Objects
- Constructors
- ArrayList
- Scanner Class
- Loops
- Conditional Statements
- Methods
- Encapsulation

## 🎯 Learning Outcomes

- Understand Java OOP concepts.
- Practice ArrayList operations.
- Learn user input handling.
- Generate summary reports.
- Build a simple console-based application.

## 👩‍💻 Author

**Your Name**

Java Developer Intern

## ▶️ How to Run the Project

### Prerequisites

- Java JDK 17 or above installed
- VS Code
- Java Extension Pack (Recommended)

### Steps to Run

1. Open the project in **VS Code**.

2. Open the **Terminal**.
   - Click **Terminal → New Terminal**

3. Navigate to the `src` folder.

```bash
cd src
```

4. Compile all Java files.

```bash
javac *.java
```

> If `javac *.java` doesn't work on your system, run:

```bash
javac Main.java Student.java GradeManager.java
```

5. Run the project.

```bash
java Main
```

### Example

```bash
PS D:\StudentGradeTracker> cd src

PS D:\StudentGradeTracker\src> javac *.java

PS D:\StudentGradeTracker\src> java Main
```

### Expected Output

```text
===== Student Grade Tracker =====

Enter number of students: 3

Student 1
Enter Name: Rahul
Enter Marks: 85

Student 2
Enter Name: Priya
Enter Marks: 92

Student 3
Enter Name: Aman
Enter Marks: 76

========== STUDENT REPORT ==========
Name                 Marks
Rahul                85
Priya                92
Aman                 76
------------------------------------
Average Marks : 84.33
Highest Marks : 92 (Priya)
Lowest Marks  : 76 (Aman)
```
