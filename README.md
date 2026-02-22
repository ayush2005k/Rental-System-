🚗 Java Vehicle Rental Management System

A structured, layered Vehicle Rental Management System built using Java.
This project demonstrates strong Object-Oriented Programming (OOP) principles, layered architecture, business logic separation, and scalable backend design.

It evolves from a basic console app into a structured backend-ready system.

📌 Features
Core Functionalities

Rent a car or motorcycle

View all available vehicles

Prevent double booking

Calculate total rental cost with:

Discount for long rentals

GST calculation

Track rental details

Role-based logical separation (Repository → Service → Model)

Advanced Backend Structure

Clean layered architecture

Business logic separated from data layer

Scalable project design

Ready for database integration (JDBC / Spring Boot)

🏗 Project Architecture
RentalSystem/
│
├── model/        → Entity classes (Vehicle, Car, Rental, Customer)
├── repository/   → Data management layer
├── service/      → Business logic layer
└── main/         → Application entry point
Layer Responsibilities
Layer	Responsibility
Model	Defines core entities
Repository	Manages vehicle data
Service	Handles rental logic
Main	Handles user interaction
🛠 Technologies Used

Java

OOP Principles

Java Collections Framework

Console-based I/O

Layered Architecture Design

🧠 Concepts Demonstrated
🔹 Object-Oriented Programming (OOP)
Abstraction

Using an abstract Vehicle class to define a common template.

Inheritance

Car and Motorcycle extend the Vehicle class.

Encapsulation

Private fields with public getters to protect data integrity.

Polymorphism

Overriding displayDetails() method in child classes.

🔹 Layered Architecture

Separation of:

Data layer

Business logic

Application entry point

This mimics real-world backend systems.

🔹 Collections Framework

Using ArrayList to manage vehicles dynamically.

🔹 Business Logic Implementation

Discount applied for rentals longer than 7 days

GST calculation included

Rental validation to prevent duplicate bookings

▶ How to Run the Project
1️⃣ Navigate to Project Root
cd RentalSystem
2️⃣ Compile All Files

If using command line:

javac model/*.java repository/*.java service/*.java main/*.java
3️⃣ Run the Application
java main.RentalSystem
💻 Sample Usage
Welcome to Rental System

1. Car: Toyota Camry | Fuel: Petrol | Doors: 4 | ₹3500/day
2. Car: Honda City | Fuel: Petrol | Doors: 4 | ₹3200/day
3. Motorcycle: Royal Enfield Classic 350 | Sidecar: false | ₹1500/day

Select vehicle number: 2
Enter your name: Ayush
Enter license number: DL12345
Enter phone: 9876543210
Rental days: 5

Customer: Ayush
Vehicle: Honda City
Days: 5
Total Cost (incl GST): ₹18880.0
📈 Future Enhancements

MySQL database integration (JDBC)

Authentication system (Admin / Customer)

Payment simulation module

Spring Boot REST API conversion

Frontend integration (React)

Revenue analytics dashboard

JWT authentication

🎯 Learning Outcomes

By building this project, you gain:

Strong understanding of OOP

Practical layered architecture experience

Clean code organization

Backend development fundamentals

Real-world rental workflow modeling

📌 Why This Project Matters

This project is designed not just as a beginner console app,
but as a foundation for building scalable backend systems.

It can be extended into:

A full Spring Boot backend

A REST API service

A startup-ready rental management system

📎 Author

Ayush Singh
Aspiring Backend Developer
