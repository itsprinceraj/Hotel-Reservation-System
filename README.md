## 🏨 Hotel Reservation System

This repository showcases a comprehensive **Hotel Management System** built using **Java** and **SQL**. The system covers essential functionalities such as:

- 📝 Room reservations
- 📞 Guest data management
- 🔄 Updating reservations
- ❌ Deleting reservations
- 🔍 Viewing room details

**Key Features**:
- Interactive console-based application for a seamless user experience.
- Real-time database operations with **MySQL** for efficient data handling.
- Robust error handling for a reliable and smooth workflow.
- Modular code for easy maintenance and scalability.

This project is a perfect demonstration of integrating Java's object-oriented principles with SQL database operations to create an efficient, real-world hotel management solution.

---

### 🚀 How to Use:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/hotel-reservation-system.git
   ```

2. **Setup the Database**:
   - Install **MySQL** on your system if you haven't already.
   - Create a new database, e.g., `hotel_management`.
   - Import the provided SQL schema file into your MySQL database to set up the required tables.

   ```sql
   CREATE DATABASE hotel_reservation;
   USE hotel_reservation;
   create table reservations (
   reservation_id int auto_increment primary key,
   guest_name varchar(255) not null,
   room_num int not null,
   phone_num varchar(255) not null,
   reservation_date timestamp default current_timestamp
   );
   ```

3. **Configure the JDBC Connection**:
   - In the `config` or `database` package, modify the **DB credentials** (username, password, URL) in the JDBC connection file to match your local database setup.

4. **Run the Application**:
   - Compile and run the Java files using any IDE (like IntelliJ IDEA or Eclipse) or via command line.
   - The system will launch in your terminal/console, allowing you to start managing hotel reservations.

5. **Enjoy the System**:
   - Add, update, or delete reservations, and manage guest data efficiently through the console interface!

---

Feel free to explore, contribute, and use this project as a reference for building similar systems! ✨

---
