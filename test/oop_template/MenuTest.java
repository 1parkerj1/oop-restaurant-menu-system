/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package oop_template;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author parker
 */
public class MenuTest {
    
    public MenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setName method, of class Menu.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "vegan";
        Menu instance = new Menu();
        instance.setName(newName);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Menu.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String newName = "vegan";
        Menu instance = new Menu();
        instance.setName(newName);
        String expResult = "vegan";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setMenuItems method, of class Menu.
     */
    @Test
    public void testSetMenuItems() {
        System.out.println("setMenuItems");
        String[][] newMenuItems = {{"1","2","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"}};
        Menu instance = new Menu();
        instance.setMenuItems(newMenuItems);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getMenuItems method, of class Menu.
     */
    @Test
    public void testGetMenuItems() {
        System.out.println("getMenuItems");
        Menu instance = new Menu();
        String[][] newMenuItems = {{"1","2","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"}};
        instance.setMenuItems(newMenuItems);
        String[][] expResult = {{"1","2","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"},{"1","2","3"}};
        String[][] result = instance.getMenuItems();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
