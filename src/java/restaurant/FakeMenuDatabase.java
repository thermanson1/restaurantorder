/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurant;

import java.util.ArrayList;
import java.util.List;
import restaurant.DataAccessStrategy;
import restaurant.MenuItem;

/**
 *
 * @author Teraesa
 */
public class FakeMenuDatabase implements DataAccessStrategy{
    private List<MenuItem> menuItems;
    
    public FakeMenuDatabase(){
        menuItems= new ArrayList<MenuItem>();
        MenuItem item = new MenuItem("Pancakes", 5.50);
        menuItems.add(item);
        item = new MenuItem("Omelet", 6.75);
        menuItems.add(item);
        item = new MenuItem("Waffles", 6.85);
        menuItems.add(item);
      item = new MenuItem("Scrambler", 8.50);
        menuItems.add(item);
        item = new MenuItem("Ham & Swiss Sandwich", 5.60);
        menuItems.add(item);
        item = new MenuItem("Burger", 7.95);
        menuItems.add(item);
        item = new MenuItem("Hot Dog", 5.25);
        menuItems.add(item);
        item = new MenuItem("Mac & Cheese", 6.25);
        menuItems.add(item);
        item = new MenuItem("Spaghetti", 7.50);
        menuItems.add(item);
        item = new MenuItem("Fajita", 6.75);
        menuItems.add(item);
        item = new MenuItem("Steak", 12.50);
        menuItems.add(item);
        item = new MenuItem("Chicken Parmesan", 10.25);
        menuItems.add(item);
        item = new MenuItem("Omelet", 6.75);
        menuItems.add(item);
        

    }
    
    @Override
    public void addMenuItem(String name, double price){
        MenuItem itemAdd = new MenuItem(name, price);
        itemAdd.setName(name);
        itemAdd.setPrice(price);
        menuItems.add(itemAdd);
    }
    
    @Override
    public void removeMenuItem(String name, double price){
        MenuItem delete = new MenuItem(name, price);
        delete.setName(name);
        delete.setPrice(price);
        for (MenuItem item: menuItems){
            if (item.equals(delete)){
                menuItems.remove(item);
            }
            
        
    }
    }

    @Override
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    
    
}
