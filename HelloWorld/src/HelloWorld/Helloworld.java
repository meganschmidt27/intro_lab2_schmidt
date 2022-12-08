import java.util.Scanner;

public class Helloworld {
   
   public static int fibonacci(int n) {
      /* Type your code here. */
      int n1 = 0;
      int n2 = 1;
      int currN;
      if (n < 0){
         return -1;
      }
      for (int i = 1; i <= n; ++i){
         currN = n1 + n2;
         n1 = n2;
         n2 = currN;
      }
      return n1;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}

// Commit two