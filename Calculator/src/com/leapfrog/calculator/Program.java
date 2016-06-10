/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;

import com.leapfrog.calculator.util.Calc;
import java.util.Scanner;

/**
 *
 * @author Aniel Bkiram Thapa
 */
public class Program {
    
    private static void menu() {
        System.out.println("1:Add");
        System.out.println("2:Sub");
        System.out.println("3:Mul");
        System.out.println("4.Div");
        System.out.println("5.Exit");
        System.out.println("Enter your choice 1-5");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MY new calculator");
        while (true) {
            System.out.println("Enter the 1st number: ");
            double x = input.nextDouble();
            System.out.println("Enter the second number:");
            double y = input.nextDouble();
            menu();
            int choice = input.nextInt();
    
            Calc calc = new Calc();
              double total = calc.calculate(choice,x,y);
            System.out.println("Total =" + total);
            System.out.println("Do you want to continue [Y/N]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
    
}
