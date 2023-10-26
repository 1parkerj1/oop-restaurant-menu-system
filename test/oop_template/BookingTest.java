/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package oop_template;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 44759
 */
public class BookingTest {
    
    public BookingTest() {
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
     * Test of setBookingNumber method, of class Booking.
     */
    @Test
    public void testSetBookingNumber() {
        System.out.println("setBookingNumber");
        String myBookingNumber = "abc123";
        Booking instance = new Booking();
        instance.setBookingNumber(myBookingNumber);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Booking.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String myName = "Lina";
        Booking instance = new Booking();
        instance.setName(myName);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class Booking.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String myNumber = "07522111111";
        Booking instance = new Booking();
        instance.setPhoneNumber(myNumber);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Booking.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date myDate = null;
        Booking instance = new Booking();
        instance.setDate(myDate);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTime method, of class Booking.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String myTime = "17:00-19:00";
        Booking instance = new Booking();
        instance.setTime(myTime);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPartySize method, of class Booking.
     */
    @Test
    public void testSetPartySize() {
        System.out.println("setPartySize");
        int myPartySize = 20;
        Booking instance = new Booking();
        instance.setPartySize(myPartySize);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getBookingNumber method, of class Booking.
     */
    @Test
    public void testGetBookingNumber() {
        System.out.println("getBookingNumber");
        String myBookingNumber = "abc123";
        Booking instance = new Booking();
        instance.setBookingNumber(myBookingNumber);
        String expResult = "abc123";
        String result = instance.getBookingNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Booking.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String myName = "Lina";
        Booking instance = new Booking();
        instance.setName(myName);
        String expResult = "Lina";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class Booking.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        String myNumber = "07522111111";
        Booking instance = new Booking();
        instance.setPhoneNumber(myNumber);
        String expResult = "07522111111";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Booking.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Booking instance = new Booking();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class Booking.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        String myTime = "17:00-19:00";
        Booking instance = new Booking();
        instance.setTime(myTime);
        String expResult = "17:00-19:00";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPartySize method, of class Booking.
     */
    @Test
    public void testGetPartySize() {
        System.out.println("getPartySize");
        int myPartySize = 20;
        Booking instance = new Booking();
        instance.setPartySize(myPartySize);
        int expResult = 20;
        int result = instance.getPartySize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
