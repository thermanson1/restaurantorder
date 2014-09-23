/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurant;

import java.util.List;
import restaurant.DataAccessStrategy;
import restaurant.MenuItem;

/**
 *
 * @author Teraesa
 */
public class MenuService {
    private DataAccessStrategy accessor;
    
    public MenuService(DataAccessStrategy accessor){
      this.setAccessor(accessor);
    }
    
    public List<MenuItem> getMenuItems(){
        return accessor.getMenuItems();
    }

    public DataAccessStrategy getAccessor() {
        return accessor;
    }

    public void setAccessor(DataAccessStrategy accessor) {
        if(accessor == null){
            throw new IllegalArgumentException("accessor is null");
        }
        this.accessor = accessor;
    }
    
    public void processOrder(String selectedItem){
        //for future
    }
    
    
}
