package com.example.spring_jpa_data_model.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

    @Entity
    @Table(name = "orders")
    public class Order {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private LocalDate orderDate;

        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        private User user;

        @ManyToMany
        @JoinTable(
                name = "order_products",
                joinColumns = @JoinColumn(name = "order_id"),
                inverseJoinColumns = @JoinColumn(name = "product_id")
        )
        private List<Product> products;

        public Order() {}

        public Order(LocalDate orderDate, User user, List<Product> products) {
            this.orderDate = orderDate;
            this.user = user;
            this.products = products;
        }

        public Long getId() { return id; }

        public LocalDate getOrderDate() { return orderDate; }
        public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }

        public User getUser() { return user; }
        public void setUser(User user) { this.user = user; }

        public List<Product> getProducts() { return products; }
        public void setProducts(List<Product> products) { this.products = products; }
    }
