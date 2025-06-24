# Tutor Booking System

A web application for students to book sessions with tutors.

## Features

### For Students
- **User Registration and Login:** Secure registration and authentication system.
- **Profile Management:** View and update personal details.
- **Book Tutors:** Browse and book available tutors for sessions.
- **Booking Management:** Cancel bookings or edit booked times.
- **Payments:** Make payments and view payment history.
- **Reviews:** Write reviews for tutors.

### For Admin
- **Admin Dashboard:** Centralized panel to manage users, tutors, bookings, payments, reviews, and admins.
    - **User Management:** Delete users.
    - **Tutor Management:** Add, remove, or edit tutor profiles.
    - **Review Management:** Delete inappropriate reviews.
    - **Payment Management:** View all payment transactions.
    - **Admin Management:** Create new admins or remove existing admins.
    - **Booking Management:** View all bookings.

## Technology Stack

- **Backend:** Java Servlets
- **Frontend:** JSP, CSS
- **Database:** Plain text files (for development simplicity)

## UML Diagram

- 
 <a href="UML%20diagram/UML%20diagram.png"><img src="UML%20diagram/UML%20diagram.png" style="height: 600px"></a>

- Open : <a href="UML%20diagram/UML%20diagram.drawio">Draw IO</a>

- Open : <a href="UML%20diagram/UML%20diagram.docx">Microsoft Word</a>

## Getting Started

### Prerequisites

- Java Development Kit (JDK), version 8 or higher
- Apache Tomcat or similar Java servlet container

### Setup Instructions

1. **Clone the repository:**
   ```
   git clone https://github.com/Thisal-D/Tutor-Booking-System.git
   ```

2. **Import into your IDE:**
   - Open your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).
   - Import the project as an existing Maven or Java web project.

3. **Configure Servlet Container:**
   - Deploy the project to Apache Tomcat or your preferred servlet container.

4. **Run the application:**
   - Start your servlet container.
   - Access the application in your browser at `http://localhost:8080/Tutor-Booking-System`

### File-based Database

This project uses plain text files to store user, tutor, booking, payment, and review data. Ensure the application has write permissions to these files.

### Usage

- Register or log in as a student (user) to book sessions.
- Log in as an admin to access management features.
- Use the dashboard to manage users, tutors, and bookings.
