# Book My Stay App

This project is a Hotel Booking Management System designed to demonstrate Core Java and data structures.

## Use Case 1: Application Entry & Welcome Message
**Goal**: Establish a starting point for the application.

### How to Run
1. Compile: `javac App/src/UC1_WelcomePage.java`
2. Run: `java -cp App/src UC1_WelcomePage`

## Use Case 2: Basic Room Types & Static Availability
**Goal**: Introduce object modeling through inheritance and abstraction.

### Key Concepts Used
- **Abstract Class**: Defines common attributes and behavior for all room types.
- **Inheritance**: Concrete room classes (Single, Double, Suite) extend the abstract Room class.
- **Polymorphism**: Room objects are referenced using the `Room` type.
- **Encapsulation**: Room attributes are controlled and modified only through defined behavior.
- **Static Availability**: Availability is stored using simple variables to highlight the limitations of scattered state management.

### How to Run
1. Compile: `javac App/src/UseCase2RoomInitialization.java`
2. Run: `java -cp App/src UseCase2RoomInitialization`