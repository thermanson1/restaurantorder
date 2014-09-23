/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurant;

import java.util.List;

/**
 *
 * @author Teraesa
 */
public interface DataAccessStrategy {
    public void addMenuItem(String name, double price);
    public void removeMenuItem(String name, double price);
    public List<MenuItem> getMenuItems();
}
