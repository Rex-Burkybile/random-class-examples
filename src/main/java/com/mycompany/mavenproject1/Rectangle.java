/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 0800490
 */
public class Rectangle {
    private double length;
    private double width;
   
    public Rectangle () {
        this.length = 1;
        this.width = 1;
    }
    
     public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public static void printtype() {
        System.out.println("yuh");
    }
    
    public void setlength(double length) {
        this.length = length;
    }
    
    public void setwidth(double width) {
        this.width = width;
    }
    
    public double getlength() {
        return this.length;
    }
    
    public double getwidth() {
        return this.width;
    }
    public double getarea() {
        return width * length;
    }
}
