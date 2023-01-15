package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private String name;
    private Date dateAdded;


        public MenuItem(String name, String description, double price, String category, Date dateAdded) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
