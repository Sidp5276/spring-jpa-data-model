package com.example.spring_jpa_data_model.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

    @Entity
    public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private BigDecimal price;

        @ManyToMany(mappedBy = "products")
        private List<Order> orders;

        public Product() {}

        public Product(String name, BigDecimal price, List<Order> orders) {
            this.name = name;
            this.price = price;
            this.orders = orders;
        }

        public Long getId() { return id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public BigDecimal getPrice() { return price; }
        public void setPrice(BigDecimal price) { this.price = price; }

        public List<Order> getOrders() { return orders; }
        public void setOrders(List<Order> orders) { this.orders = orders; }
    }
