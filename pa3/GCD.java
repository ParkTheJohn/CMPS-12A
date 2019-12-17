//GCD.java
//Jongwoo Park
//jpark510
//pa3
//finds the GCD of two integers entered by the user

import java.util.Scanner;
public class GCD {
    
    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b, temp, temp1, r, first, second;
        String error = "Please enter a positive integer: ";
        
        System.out.print("Enter a positive integer: ");
        while(true) {
            if ( !sc.hasNextInt() ) {    // if next token is not int
                sc.next();               // throws it away
                System.out.print(error);  // repeats until int
            } else {
                first = sc.nextInt();   // store it in a
                if (first<=0) {
                    System.out.print(error);  // if it is negative, repeat   
                } else {
                    break;
                }
            }
        }
       
        System.out.print("Enter another positive integer: ");
        while(true) {
            if ( !sc.hasNextInt() ) {
                sc.next();
                System.out.print(error);
            } else {
                second = sc.nextInt();
                if (second<=0) {
                    System.out.print(error);  // if it is negative, repeat    
                } else {
                    break;
                }
            }
        }
        
        if (second>first) {     // sorts the two integers into descending order
            b = first;
            a = second;
        } else {
            b = second;
            a = first;
        }
        
        r = temp1 = b;        // initializes the last and previous remainder
        while (!(r==0) ) {    // Euclidean Algorithm, repeat until r==0
            temp = b;         // copies the previous divisor
            temp1 = r;        // copies the previous remainder
            r = a%b;          // sets r as the new remainder
            a = temp;         // copies previous divisor into the dividend
            b = r;            // sets b as the new remainder
        }
        //GCD is temp1, which is the previous remainder, when remainder reaches 0.
        System.out.println("The GCD of " + first + " and " + second + " is " + temp1 + ".");  
    }
}
