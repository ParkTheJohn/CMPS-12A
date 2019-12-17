// Queens.java
// Jongwoo Park
// jpark510
// pa5
// finds all solutions to n-Queens problem

public class Queens {
    
    public static void main (String[] args) {
        int n = 0;
        boolean verbose = false;
        try {
            if (args.length == 1) {
                n = Integer.parseInt(args[0]);
            } else if (args.length == 2) {
                if (args[0].equals("-v")) {
                    verbose = true;
                    n = Integer.parseInt(args[1]);
                } else {
                    usageMessage();
                    return;
                }
            } else {
                usageMessage();
                return;
            }
        } catch (NumberFormatException e1) {
            usageMessage();
            return;
        }
        
        if (n>13) {
            usageMessage();
            return;
        }
        
        if (n<1) {
            usageMessage();
            return;
        }
        
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = i + 1;
        }
        int counter = 0;
      
        for (int i = 0; i < factorial(n); i++ ) {
            if (isSolution(A)) {
                if (verbose == true) {
                    printArray(A);
                }
                counter += 1;
            }
            nextPermutation(A);
        }
        System.out.println(n + "-Queens has " + counter + " solutions");
    }
    
    static void swap (int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
        
    }
    
    static void reverse (int[] A, int start, int end) {
        for (int i = 0; i < (end - start + 1)/2; i++) {
            swap(A, i + start, end - i);
        }
    }
    
    static void printArray (int[] A) {
        System.out.print( "(" );
        for(int i=0; i<A.length; i++) {
            if (i!=0) {
                System.out.print(", ");
            }
            System.out.print(A[i]);
        }
        System.out.println(")");
    }
    
    static void nextPermutation(int[] A){
        int pivot = -1;
        int successor = -1;
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] < A[i+1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {    
            reverse(A, 0, A.length -1);
            return;
        }
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] > A[pivot]) {
                successor = i;
                break;
            }
        }
        swap(A, pivot, successor);
        reverse(A, pivot + 1, A.length - 1);
        return;
    }
    
    static boolean isSolution(int[] A) {
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
               if (Math.abs(A[j] - A[i]) == j - i) {
                   return false;
               }
            }
         }
        return true;
    }
    
    static int factorial(int n) {
        int product = 1, i = 1;
        while(i<=n){
           product *= i; 
           i++;
        }
        return product;
     }
    
    static void usageMessage() {
        System.out.println("Usage: Queens [-v] number");
        System.out.println("Option: -v verbose output, print all solutions");
        return;      
    }
}
