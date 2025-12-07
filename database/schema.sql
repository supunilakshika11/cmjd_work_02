CREATE DATABASE gear_rent_pro;
USE gear_rent_pro;

CREATE TABLE branches (
    branch_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    address VARCHAR(200),
    contact VARCHAR(50)
);

CREATE TABLE categories (
    category_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    description VARCHAR(200),
    base_price_factor DECIMAL(5,2),
    weekend_multiplier DECIMAL(5,2),
    late_fee_per_day DECIMAL(10,2)
);

CREATE TABLE equipment (
    equipment_id INT PRIMARY KEY AUTO_INCREMENT,
    category_id INT,
    branch_id INT,
    brand VARCHAR(50),
    model VARCHAR(50),
    purchase_year YEAR,
    daily_base_price DECIMAL(10,2),
    security_deposit DECIMAL(10,2),
    status ENUM('Available','Reserved','Rented','Under Maintenance'),
    FOREIGN KEY (category_id) REFERENCES categories(category_id),
    FOREIGN KEY (branch_id) REFERENCES branches(branch_id)
);

CREATE TABLE customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    nic_passport VARCHAR(20),
    contact_no VARCHAR(20),
    email VARCHAR(100),
    address VARCHAR(200),
    membership_level ENUM('Regular','Silver','Gold')
);

CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(255),
    role ENUM('Admin','BranchManager','Staff'),
    branch_id INT NULL
);

CREATE TABLE reservations (
    reservation_id INT PRIMARY KEY AUTO_INCREMENT,
    equipment_id INT,
    customer_id INT,
    branch_id INT,
    start_date DATE,
    end_date DATE,
    status ENUM('Active','Cancelled'),
    FOREIGN KEY (equipment_id) REFERENCES equipment(equipment_id),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    FOREIGN KEY (branch_id) REFERENCES branches(branch_id)
);

CREATE TABLE rentals (
    rental_id INT PRIMARY KEY AUTO_INCREMENT,
    equipment_id INT,
    customer_id INT,
    branch_id INT,
    start_date DATE,
    end_date DATE,
    rental_amount DECIMAL(10,2),
    security_deposit DECIMAL(10,2),
    membership_discount DECIMAL(5,2),
    long_rental_discount DECIMAL(5,2),
    final_payable DECIMAL(10,2),
    payment_status ENUM('Paid','Partially Paid','Unpaid'),
    rental_status ENUM('Active','Returned','Overdue','Cancelled'),
    actual_return_date DATE,
    damage_description VARCHAR(200),
    damage_charge DECIMAL(10,2),
    FOREIGN KEY (equipment_id) REFERENCES equipment(equipment_id),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    FOREIGN KEY (branch_id) REFERENCES branches(branch_id)
);
