//-----------------------------------------------------------
// Lawn.java
// Jongwoo Park
// jpark510
// lab3
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

      Llength = sc.nextDouble();
      Lwidth = sc.nextDouble();
      Larea = Llength*Lwidth;
      
      Hlength = sc.nextDouble();
      Hwidth = sc.nextDouble();
      Harea = Hlength*Hwidth;
      
      Lawnarea = Larea-Harea;

      System.out.println("The lawn area is " + Lawnarea + " square feet.");
     
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
     



