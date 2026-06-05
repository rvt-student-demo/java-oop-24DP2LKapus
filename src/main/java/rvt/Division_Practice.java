package rvt;

import java.util.*;

public class Division_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         while(true) {


            System.out.print("Enter the numerator: ");
            String numerator = scanner.nextLine();
            if(numerator.startsWith("q")) {
                break;
             }

            int numeratorint;

            try {
                numeratorint = Integer.parseInt(numerator);
            }

            catch(NumberFormatException e ) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again");
                continue;
            }
            

            System.out.print("Enter the divisor: ");
            String divisorStr = scanner.nextLine();

            int divisor;


            try {
                divisor = Integer.parseInt(divisorStr);
            }

            catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                continue;
            }

           try {
                System.out.println(numeratorint + " / " + divisor + " is " + (numeratorint / divisor));
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numeratorint + " by 0.");
            }
            
            
            
            
        }
   
    
        
}
}
