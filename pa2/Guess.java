//Guess.java
//Jongwoo Park
//jpark510
//pa2
//a program that plays an interactive guessing game with the user

import java.util.Scanner;
public class Guess {
	
   public static void main(String[] args) {
      
	  //define variables
	  Scanner sc = new Scanner(System.in);
      int max = 10;
      int min = 1;
      int range = max - min + 1;
      int guess;
      
      String win = "You win!";
      String low = "Your guess is too low.";
      String high = "Your guess is too high.";
      String lose = "\nYou lose. The number was ";
      Boolean match = false;

      //generates random number from 1 to 10
      int randnum = (int) (Math.random() * range) + min;

      System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.");
      System.out.print("\nEnter your first guess: ");
      guess = sc.nextInt();
      
      if(guess == randnum) {
         System.out.println(win);
         //sets a condition for match
         match = true;
      } else if(guess < randnum) { 
         System.out.println(low);
      } else {
         System.out.println(high); 
      }
      
      //checks the condition for match, repeat if false.
      if (match == false) {
         System.out.print("\nEnter your second guess: ");
         guess = sc.nextInt();
     
         if(guess == randnum) {
            System.out.println(win);
            match = true;
         } else if(guess < randnum) { 
            System.out.println(low);
         } else {
            System.out.println(high); 
         }
      }   

      //checks the condition for match, repeat if false.
      if (match == false) {		  
         System.out.print("\nEnter your third guess: ");
         guess = sc.nextInt();
          
         if(guess == randnum) {
            System.out.println(win);
            match = true;
         } else if(guess < randnum) { 
            System.out.println(low);
         } else {
            System.out.println(high); 
         } 
      }
      
      //prints loss if match was not met for 3 times
      if (match == false) {
         System.out.println(lose + randnum + ".");
      }  
   }
}
