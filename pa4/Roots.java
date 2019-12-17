// Roots.java
// Jongwoo Park
// jpark510
// pa4
// finds the roots of a polynomial

import java.util.Scanner;

public class Roots {
    
    public static void main (String[] args) {
        //1 
        double tolerance = 1.0e-10;
        double threshold = 1.0e-3;
        int degree;
        int n = 0;      
        double a, b;
        //2 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree: ");
        degree = sc.nextInt();
        n = degree + 1;
        System.out.println("Enter " + n + " coefficients: ");
        double [] C = new double[n];
        for (int i = 0; i<n; i++) {
            C[i] = sc.nextDouble();
        }      
        //4
        while (true) {
            System.out.println("Enter endpoints, or q to quit: ");
            if (!sc.hasNextDouble()) {
                String inputString = sc.next();
                if (inputString.equals("q")) {
                    System.out.println("bye!");
                    break;
                }    
            } else {  
                a = sc.nextDouble();
                b = sc.nextDouble();
                boolean found = false;
                double [] D = diff(C); 
                //5
                if (poly(C, a) * poly(C, b) < 0) {
                    //6
                    double odd = findRoot(C, a, b, tolerance);
                    //7
                    System.out.print("Odd root in " + "[" + a + ", " + b + "] found at: ");
                    System.out.format("%.10f\n", odd);
                    found = true;
                //8
                } else if (poly(D, a) * poly(D, b) < 0 ) {
                    //9
                    double even = findRoot(D, a, b, tolerance);
                    double y = poly(C, even);
                    //10
                    if (Math.abs(y) < threshold) {
                        //11
                        System.out.print("Even root in " + "[" + a + ", " + b + "] found at: ");
                        System.out.format("%.10f\n", even);
                        found = true;
                    }
                }
                //12
                if (found == false) {
                    System.out.println("No root found in " + "[" + a + ", " + b + "]");
                }
            }
        }
    }
    
    static double poly(double[] C, double x) {
        double y = 0;
        for (int i = 0; i < C.length; i++ ) {
            y += C[i] * Math.pow(x, i);
        }
        return y;
    }
    
    //3
    static double [] diff(double [] C) {
        double [] D = new double [C.length - 1];
        for (int i =1; i < C.length; i++) {
            D[i-1] = C[i] * i;
        }
        return D;   
    }
    
   // example FindRoot2.java 
   static double findRoot (double [] C, double a, double b, double tolerance) {
       double mid=a, width;
       
       width = b - a;
       while ( width > tolerance ){
          mid = (a + b) / 2;
          if( poly(C, a) * poly(C, mid) <= 0 ){  // if root is in [a, mid]
             b = mid;                            //    move b left
          } else {                               // else root is in (mid, b] 
             a = mid;                            //    move a right
          }
          width = b - a;
       }
       return mid;    
   }
}
