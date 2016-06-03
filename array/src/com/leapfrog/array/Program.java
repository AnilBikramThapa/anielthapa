/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.array;
import java.util.Scanner;
/**
 *
 * @author Aniel Bkiram Thapa
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
       String s;
       s=sc.next();
       int count=0;
       int y=0;
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
               {
                count++;

       }
               y=s.length()-count;
       
           }
         System.out.println("number of vowels"+count );   
         System.out.println("number of constant"+y);
    }
}

      
       