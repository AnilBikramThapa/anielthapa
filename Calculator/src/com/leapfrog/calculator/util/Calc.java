/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator.util;

/**
 *
 * @author Aniel Bkiram Thapa
 */
public class Calc {  
    public double add(double x,double y){
        return x+y;
    }
    public double sub(double x,double y){
        return x-y;
    }
    public double mul(double x,double y){
        return x*y;
    }
    public double div(double x,double y){
        return x/y;
    }
    public double calculate(int choice, double x, double y)
    {
        double total=0;
        
         if (choice == 1) {
                total = add(x, y);
            } else if (choice == 2) {
                total = sub(x, y);
            } else if (choice == 3) {
                total = mul(x, y);
            } else if (choice == 4) {
                total = div(x, y);
            } else if (choice == 5) {
                System.exit(0);
            }
    return total;
    }

   
}
