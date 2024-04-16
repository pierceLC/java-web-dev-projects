package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(10.99, "Caesar Salad", "Appetizer");
        MenuItem item2 = new MenuItem(15.99, "Grilled Salmon", "Main Course");
        MenuItem item3 = new MenuItem(7.99, "Cheesecake", "Dessert");

        ArrayList<MenuItem> initialItems = new ArrayList<>();
        initialItems.add(item1);
        initialItems.add(item2);
        initialItems.add(item3);
        Date initialDate = new Date();
        Menu menu = new Menu(initialDate, initialItems);

        // Print menu
        System.out.println("Updated Menu:");
        for (MenuItem item : menu.getItems()) {
            System.out.println(item);
        }

        String formattedDate = initialDate.toString();
        System.out.println("\nMenu last updated: " + formattedDate);

        // Print an individual menu item
        System.out.println("\nIndividual Menu Item:");
        menu.printMenuItem(item3);

        // Add a new item to the menu
        MenuItem newItem = new MenuItem(9.99, "Garlic Bread", "Appetizer");
        menu.addItem(newItem);
        MenuItem newItem1 = new MenuItem(6.99, "Brochette", "Appetizer");
        menu.addItem(newItem1);
        MenuItem newItem2 = new MenuItem(12.99, "Grilled Chicken", "Main Course");
        menu.addItem(newItem2);

        // Adding a duplicate item to the menu
        menu.addItem(item1);

        // Print the updated menu
        System.out.println("\nUpdated Menu after addition:");
        for (MenuItem item : menu.getItems()) {
            System.out.println(item);
        }

        // Remove an item from the menu
        menu.removeItem(item2);

        // Print the updated menu
        Date updatedDate = menu.getLastUpdated();
        String formattedUpdatedDateTime = updatedDate.toString();
        System.out.println("\nUpdated Menu after deletion (updated on " + formattedUpdatedDateTime + "):");
        for (MenuItem item : menu.getItems()) {
            System.out.println(item);
        }
    }
}