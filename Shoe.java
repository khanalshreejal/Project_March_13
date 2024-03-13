package org.example.Models;
import java.util.Arrays;
public class Shoe {
    String brand;
    String Name_of_the_Shoe;
    String color;
    boolean Collab;
    double price;
    String[] availableSizes;

    public Shoe(String brand, String name_of_the_Shoe, String color, boolean collab, double price, String[] availableSizes) {
        this.brand = brand;
        Name_of_the_Shoe = name_of_the_Shoe;
        this.color = color;
        Collab = collab;
        this.price = price;
        this.availableSizes = availableSizes;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName_of_the_Shoe() {
        return Name_of_the_Shoe;
    }

    public void setName_of_the_Shoe(String name_of_the_Shoe) {
        Name_of_the_Shoe = name_of_the_Shoe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCollab() {
        return Collab;
    }

    public void setCollab(boolean collab) {
        Collab = collab;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }
}