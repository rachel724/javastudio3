package restaurant;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Date dateLastUpdated;
    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addToMenu (MenuItem menuItemToAdd){
        menuItems.add(menuItemToAdd);
        System.out.println(this.menuItems);
    }

    public static void main(String[] args) {
        MenuItem newItem = new MenuItem(true, 4.99,"queso", "appetizer");
        //Menu menuTest = new Menu(newItem);
        Menu menuTest = new Menu();
        menuTest.addToMenu(newItem);
        System.out.println(menuTest.menuItems.get(0).getPrice());
    }
}

