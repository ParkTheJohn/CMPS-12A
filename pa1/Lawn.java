//-----------------------------------------------------------
// Lawn.java
// Jongwoo Park
// 1599522
// pa1
// Java program that interacts with the user
//-----------------------------------------------------------
import java.util.Scanner;

class Lawn{

   public static void main(String[] args){

      double Llength, Lwidth, Larea;
      double Hlength, Hwidth, Harea;
      double Lawnarea;
      double mrate;;
      long  h, m, s;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the length and width of the lot, in feet: ");
      Llength = sc.nextDouble();
      Lwidth = sc.nextDouble();
      Larea = Llength*Lwidth;
      
      System.out.print("Enter the length and width of the house, in feet: ");
      Hlength = sc.nextDouble();
      Hwidth = sc.nextDouble();
      Harea = Hlength*Hwidth;
      
      Lawnarea = Larea-Harea;

      System.out.println("The lawn area is " + Lawnarea + " square feet.");
   
      System.out.print("Enter the mowing rate, in square feet per second: ");  
      mrate = sc.nextDouble();
      
      double mtime = Lawnarea/mrate;
      s = Math.round(mtime);
      m = s/60;
      s = s%60;
      h = m/60;
      m = m%60;
      
      System.out.println("The mowing time is " + h + " hour" + (h==1 ? " " : "s ") + m + " minute" + (m==1 ? " " : "s ") + s + " second" + (s==1 ? "." : "s.")); 

   }

}
     



