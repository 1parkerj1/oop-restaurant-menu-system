/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;
import java.util.Date;

/** represents a reservation made at the restaurant
 *
 * @author Stavroula Niarchou
 * 
 */
public class Booking {
    private String bookingNumber;
    private String name;
    private String phoneNumber;
    private Date date;
    private String time;
    private int partySize;
    
  
public void setBookingNumber(String myBookingNumber){
    this.bookingNumber = myBookingNumber;
}

public void setName(String myName){
    this.name = myName;
}
public void setPhoneNumber(String myNumber){
    this.phoneNumber = myNumber;
}
public void setDate(Date myDate){
    this.date = myDate;
}
public void setTime(String myTime){
    this.time = myTime;
}
public void setPartySize(int myPartySize){
    this.partySize = myPartySize;
}
public String getBookingNumber(){
    return bookingNumber;
}
public String getName(){
    return name;
}
public String getPhoneNumber(){
    return phoneNumber;
}
public Date getDate(){
    return date;
}
public String getTime(){
    return time;
}
public int getPartySize(){
    return partySize;
}
}
