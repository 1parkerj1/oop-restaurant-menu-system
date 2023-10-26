/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

/**
 *
 * @author zaragoldstone
 */
public class Staff {
    private int staffCode;
    private String staffName;
    
    public Staff(int newStaffCode, String newStaffName) {
        this.staffCode = newStaffCode;
        this.staffName = newStaffName;
    }
    
    public void setStaffCode(int newStaffCode) {
        this.staffCode = newStaffCode;
    }
    
    public void setStaffName(String newStaffName) {
        this.staffName = newStaffName;
    }
    
    public int getStaffCode() {
        return this.staffCode;
    }
    
    public String getStaffName() {
        return this.staffName;
    }
}