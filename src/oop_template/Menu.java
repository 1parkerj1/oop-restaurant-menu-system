 package oop_template;

/**
 *
 * @author parker
 */
public class Menu {
    
    // class attributes
    private String[][] menuItems;
    private String menuName;
    
    // class getters/setters
   
    /**
     * sets the menu name
     * @param newName 
     */
    public void setName (String newName) {
        this.menuName = newName;
    }
    /**
     * getter for menu name
     * @return 
     */
    public String getName() {
        return menuName;
    }
    
    /**
     * sets the array menu items
     * @param newMenuItems 
     */
    public void setMenuItems (String[][] newMenuItems) {
        this.menuItems = newMenuItems;
    }
    
    /**
     * getter for menuItems
     * @return 
     */
    public String[][] getMenuItems() {
        return menuItems;
    }
    
}
