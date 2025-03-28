package com.remocesev;

import java.util.Objects;

public class Product {
    int id; 
    String name;
    String cost;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    // Overridden toString Method
    @Override
    public String toString() {
        return id + " " + name + " " + cost;
    }

    // Overridden equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Reference comparison
        if (obj == null || getClass() != obj.getClass()) return false; // Null check & Class check
        Product ref = (Product) obj;
        return id == ref.id &&
               Objects.equals(name, ref.name) &&
               Objects.equals(cost, ref.cost);
    }

    // Overridden hashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost);
    }

    // Main Method for Testing
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Laptop");
        p1.setCost("50000");

        Product p2 = new Product();
        p2.setId(1);
        p2.setName("Laptop");
        p2.setCost("50000");

        // Test toString
        System.out.println("Product Details: " + p1.toString());

        // Test equals
        System.out.println("Are p1 and p2 equal? " + p1.equals(p2));

        // Test hashCode
        System.out.println("HashCode of p1: " + p1.hashCode());
        System.out.println("HashCode of p2: " + p2.hashCode());
    }
}
