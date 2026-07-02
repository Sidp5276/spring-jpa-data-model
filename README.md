## Spring JPA Data Model
Overview

This project implements a relational data model using Spring Boot and Spring Data JPA.
It demonstrates entity mapping, relationships, and automatic schema generation using Hibernate.

## Tech Stack

Java 21

Spring Boot

Spring Data JPA

Hibernate ORM

H2 In-Memory Database

Maven

## Entities & Relationships
👤 User

id (auto-generated)

name

email

One-to-Many relationship with Orders

📦 Order

id (auto-generated)

orderDate

Many-to-One relationship with User

Many-to-Many relationship with Product

🛒 Product

id (auto-generated)

name

price

Many-to-Many relationship with Order

## Database Behavior

When the application runs:

✔ Hibernate auto-creates tables
✔ Relationships are mapped with foreign keys
✔ Join table is created for many-to-many mapping 
