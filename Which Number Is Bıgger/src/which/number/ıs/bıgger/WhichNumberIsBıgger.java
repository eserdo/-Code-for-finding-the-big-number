/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package which.number.ıs.bıgger;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class WhichNumberIsBıgger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input=new Scanner(System.in);
       
       double a,b;
       
       System.out.println(" enter the number a");
       a=input.nextDouble();
       
       System.out.println(" enter the number b");
       b=input.nextDouble();
       
      if (b<a){
          System.out.println(" number a is bigger than number b");
      }
      
      else if (b==a){ 
          System.out.println(" number a equals number b ");
      }
      else { 
          
          System.out.println(" number b bigger than  number a");
      }
      
        
        
        
        
    }
    
}
