/*

          A
        A B
      A B C
    A B C D  
  A B C D E

 */
import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter value: ");

            int val = obj.nextInt();
            int Asciival = 65;

            for (int i = 1; i <= val; i++) {
                for (int k = val; k >= i; k--) {
                    System.out.print("  ");
                }
                for (int j = 0; j < i; j++) {
                    int Asciival1 = Asciival+j;
                    System.out.print((char) Asciival1 + " ");
                }
                System.out.println(" ");
            }
        }
    }
}


/*

          A
        B A
      C B A
    D C B A 
  E D C B A

 */

/* 
 import java.util.Scanner;

 public class pattern20 {
     public static void main(String[] args) {
         try (Scanner obj = new Scanner(System.in)) {
             System.out.print("Enter value: ");
 
             int val = obj.nextInt();
             int Asciival = 64;
 
             for (int i = 0; i <= val; i++) {
                 for (int k = val; k >= i; k--) {
                     System.out.print("  ");
                 }
                 for (int j = i; j >= 1; j--) {
                     int Asciival1 = Asciival+j;
                     System.out.print((char) Asciival1 + " ");
                 }
                 System.out.println(" ");
             }
         }
     }
 }
*/     
