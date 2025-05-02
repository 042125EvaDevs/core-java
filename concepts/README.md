# 📘 Concepts + Practice

This guide is designed to help you learn through the development of a project.
Each concept is explained clearly and followed by targeted practice challenges and mini-projects.

---

[//]: # 'concepts-start'

## [Card Game](card-game/src/main/java/xyz/catuns/eva/cardgame/Main.java)

A sample card game

### Concept:

### Practice:

---


##  [OOP](oop/src/main/java/xyz/catuns/oop/Oop.java):

Object Oriented programming

### Concept:

### Practice:

---

[//]: # 'concepts-end'

---

# 🧩 Mini Challenges

[//]: # 'challenges-start'

## Challenge: [Encapsulation](./concepts/practice/src/main/java/xyz/catuns/eva/encapsulation/Encapsulation.java):

### Goal:
Create a `BankAccount` class with private fields for account number, balance and account holder's name. They should implement public getter and setter methods to access and modify these fields.

### Goal
Design a `Student` class with private attributes like name, ID and grades. Implement methods to add, update and 
retrieve student information.


## Challenge: [Inheritance](challenge/src/main/java/xyz/catuns/eva/Main.java):

### Goal:
Create an `Employee` with common attributes such as name and salary. Then, create subclasses `Manager` 
and `Developer` that inherit from `Employee`. Add specific attributes and methods relevant to each.

### Goal
Create a superclass `Shape` with the method `calculateArea()`. Create subclasses `Circle`, `Rectangle` and `Triangle` that
inherit from `Shape` and provide specific implementations for calculating the area.


## Challenge: [Abstraction](challenge/src/main/java/xyz/catuns/eva/encapsulation/Encapsulation.java):

### Goal:
Define an abstract class or interface `Payment` with a method `processPayment()`. Implement concrete classes
`CreditCardPayment` and `PaypalPayment` to provide specific processing logic.
> The actual processing logic is irrelevant. The main focus is to implement the `Payment` with proper
> syntax.

### Goal
Design an abstract class `Animal` with an abstract method `makeSound()`. Create subclasses: `Dog`,
`Cat`, and `Cow` that implement this method.


## Challenge: [Polymorphism](challenge/src/main/java/xyz/catuns/eva/encapsulation/Encapsulation.java):

### Goal:

Develop a class `Calculator` with a method `add()`. Create variations of the `add()`
method to allow adding values of different data types (`double`, `int`, `float`) such as :
`add(int a, int b)` or `add(double a, double b)`. Infer the proper return type to minimize
data loss. Be sure to include the `@Override` annotation.


[//]: # 'challenges-end'

---

#  Integrated Capstone

[//]: # 'capstone-start'

## Project: Library Management System

Build a system with classes `LibraryItem`(_abstract_), `Book`, and `Magazine`. Implement
encapsulation for item details, inheritance for shared attributes, abstraction for common
behaviors, and polymorphism to handle different item types seamlessly

--- 

## Project: Online Shopping Cart

Design classes such as `Product`, `Electronics` and `Clothing`. Use encapsulation to protect
product categories, inheritance to define product categories, abstraction for payment processing,
and polymorphism to apply discounts differently based on product type

[//]: # 'capstone-end'

---

✅ **Tip:** Tackle each section during a Sprint to align learning with development goals.
