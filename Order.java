package org.example.Models;
import java.util.Arrays;
import java.util.List;
public class Order {
    List<Shoe> catalog;
    List<Shoe> orders;

    public Order(List<Shoe> catalog, List<Shoe> orders) {
        this.catalog = catalog;
        this.orders = orders;
    }

    public List<Shoe> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Shoe> catalog) {
        this.catalog = catalog;
    }

    public List<Shoe> getOrders() {
        return orders;
    }

    public void setOrders(List<Shoe> orders) {
        this.orders = orders;
    }

    public void Order(Shoe shoe, int quantity) {
        for (int i = 0; i < quantity; i++) {
            orders.add(shoe);
        }
    }
    public void Catalog() {
        System.out.println("Catalog:");
        for (Shoe shoe : catalog) {
            System.out.println(shoe);
        }
    }
    public void Orders() {
        System.out.println("Orders:");
        for (Shoe shoe : orders) {
            System.out.println(shoe);
        }
    }
}
