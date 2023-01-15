package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private static ArrayList<MenuItem> menuItems = new ArrayList<>();
    private static Date lastUpdate;

    public Menu(ArrayList<MenuItem> menuItems, Date lastUpdate) {
        this.menuItems = menuItems;
        this.lastUpdate = lastUpdate;
    }

    public static ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public static void setMenuItems(ArrayList<MenuItem> menuItems) {
        Menu.menuItems = menuItems;
    }

    public static Date getLastUpdate() {
        return lastUpdate;
    }

    public static void setLastUpdate(Date lastUpdate) {
        Menu.lastUpdate = lastUpdate;
    }

    public static void main(String[] args) {

        MenuItem pizza = new MenuItem("Pizza", "Cheese", 12.00, "Entree", new Date(2023,01,14));
        MenuItem burger = new MenuItem("Burger", "Single", 14.00, "Entree", new Date(2023,01,11));
        MenuItem porkSteak = new MenuItem("Pork Steak", "Thick", 16.00, "Entree", new Date(2023,01,01));

        Menu january = new Menu(menuItems, new Date());
        january.menuItems.add(pizza);
        january.menuItems.add(burger);
        january.menuItems.add(porkSteak);

        System.out.println(january.lastUpdate);
    }
}
