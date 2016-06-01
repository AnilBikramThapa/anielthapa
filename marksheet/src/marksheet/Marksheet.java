/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marksheet;
import java.util.Scanner;
/**
 *
 * @author Aniel Bkiram Thapa
 */
public class Marksheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
        System.out.println("Enter the name of student:");
        String a=input.next();
        System.out.println("Now enter the symbol number: ");
        int b=input.nextInt();
        System.out.println("Enter the marks of subject");
        System.out.println("Math:");
        double c=input.nextFloat();
        System.out.println("Social:");
        double d=input.nextFloat();
        System.out.println("Science:");
        double e=input.nextFloat();
        System.out.println("English:");
        double f=input.nextFloat();
        System.out.println("Nepali:");
        double g=input.nextFloat();
        System.out.println("Computer:");
        double h=input.nextFloat();
        double total=c+d+e+f+g+h;
        double per=total/6;  
        System.out.println("Name" + a);
        System.out.println("Symbol no:" +b);
            System.out.println("Math:"+c);
            System.out.println("Social:"+d);
            System.out.println("Science:"+e);
            System.out.println("English:"+f);
            System.out.println("Nepali:"+g);
            System.out.println("Computer:"+h);
            System.out.println("Total:"+total);
            System.out.println("percentage="+per+"%");
           
        if (c<=32 && d<=32 && e<=32 f<=32 && g<=32 && h<=32 ){
        System.out.println("Failed");
        }
        else{
        String division=null;
        if (per>=80)
        {
            division="Distinction";
        }
        else if (per>=60)
        {
            division="1st division";
        }
        else if (per=>50)
        {
            division="2nd division";
        }
        else if (per=>40)
        {
            division="3rd division";
        
            System.out.println("division"+division);
                
        }
                }
// TODO}
    System.out.println("Do u want to continue [y/n]");
    String ch=input.next();
    if (ch.equalsIgnorecase("n"))
    {
        System.exit(0);
    }
        }
    }
}