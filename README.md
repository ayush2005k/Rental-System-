# 🚗 Vehicle Rental Management System (Java)

A structured, layered **Vehicle Rental Management System** built using Java. This project demonstrates strong Object-Oriented Programming (OOP) principles, layered architecture, and business logic separation, evolving from a simple console app into a scalable backend-ready system.

## 📌 Features

### Core Functionalities
* **Dynamic Booking:** Rent cars or motorcycles with real-time availability tracking.
* **Double-Booking Prevention:** Logic-gate to ensure a vehicle cannot be rented twice simultaneously.
* **Smart Pricing Engine:**
    * Automatic **Discount** calculation for long-term rentals (7+ days).
    * **GST calculation** integrated into the final billing.
* **Role-Based Logic:** Separation of concerns using a (Repository → Service → Model) workflow.

### Advanced Backend Structure
* **Clean Layered Architecture:** Decouples data storage from business rules.
* **Scalable Design:** Ready for database integration (JDBC / Spring Boot).

---

## 🏗 Project Architecture
The project follows a modular directory structure to mimic real-world production environments:

```text
RentalSystem/
│
├── model/       → Entity classes (Vehicle, Car, Motorcycle, Rental, Customer)
├── repository/  → Data management layer (In-memory storage)
├── service/     → Business logic layer (Price calculation, Validation)
└── main/        → Application entry point (Console UI)
🧠 Concepts Demonstrated
🔹 Object-Oriented Programming (OOP)
Abstraction: Used an abstract Vehicle class as a template for all types.

Inheritance: Car and Motorcycle extend the base properties of Vehicle.

Encapsulation: Protected data integrity using private fields and public getters/setters.

Polymorphism: Overriding displayDetails() to show specific specs (e.g., doors for cars, sidecars for bikes).

🔹 Backend Fundamentals
Java Collections Framework: Utilized ArrayList and List for dynamic data handling.

Logic Isolation: The UI (Main) never talks directly to the Data (Repository); it must go through the Service Layer.

🛠 Technologies Used
Language: Java (JDK 8 or higher)

Design Pattern: Layered Architecture (3-Tier)

▶ How to Run
Clone the repository:

Bash
git clone [https://github.com/your-username/Vehicle-Rental-System.git](https://github.com/your-username/Vehicle-Rental-System.git)
cd Vehicle-Rental-System
Compile the project:

Bash
javac model/*.java repository/*.java service/*.java main/*.java
Run the application:

Bash
java main.RentalSystem
📈 Future Enhancements
[ ] Database Integration: Move from In-Memory lists to MySQL using JDBC.

[ ] Spring Boot Conversion: Transform the project into a REST API.

[ ] Security: Add JWT-based Authentication for Admin/Customer roles.

[ ] Frontend: Build a React.js dashboard to interact with the backend.

📎 Author
Ayush Kumar Singh

Aspiring Backend Developer | VIT Bhopal 2027

LinkedIn | Portfolio
