CREATE TABLE sales_ (
    sales_id INT AUTO_INCREMENT,
    customer_id_fk INT,
    order_date DATE,
    product_id_fk INT,
    quantity INT,invetorymis
    UnitPrice DECIMAL(10, 2),
    TotalAmount DECIMAL(10, 2) AS (quantity * UnitPrice) STORED,
    Payment_Status VARCHAR(20),
    Soldby_User_id_fk INT,
    PRIMARY KEY (sales_id),
    FOREIGN KEY (customer_id_fk) REFERENCES customer(CustomerID),
    FOREIGN KEY (product_id_fk) REFERENCES product(ProductID),
    FOREIGN KEY (Soldby_User_id_fk) REFERENCES users(UserID)
);
