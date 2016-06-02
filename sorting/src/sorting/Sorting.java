/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Aniel Bkiram Thapa
 */
public class Sorting {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] num={2,1,5,15,6,8};// TODO code application logic here  int[] num={2,1,5,15,8,16,12};
    for(int i=0;i<num.length;i++)
    {
        for(int j=i+1;j<num.length;j++)
                {
                    if(num[i]>num[j])
                    {
                        int temp=num[i];
                        num[i]=num[j];
                        num[j]=temp;
                    }
                    
                }
        
    }
        System.out.println("ascending order");
for(int i=0;i<num.length;i++){
    System.out.println(num[i]);
}
    }
    
}
