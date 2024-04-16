package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
    public void addItem(MenuItem itemToAdd) {
        if (items.contains(itemToAdd)) {
            System.out.println("Warning: Item already exists on the menu!");
        } else {
            items.add(itemToAdd);
            updateLastUpdated(new Date());
        }
    }

        public void removeItem(MenuItem itemToRemove) {
        items.remove(itemToRemove);
        updateLastUpdated(new Date());
    }


    public void updateLastUpdated(Date newLastUpdated) {
        setLastUpdated(newLastUpdated);
    }

    public void printMenuItem(MenuItem item) {
        System.out.println(item);
    }

    public void printMenu() {
        for (MenuItem item : items) {
            printMenuItem(item);
        }
    }

}


