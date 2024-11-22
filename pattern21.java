/*
  
  A B C D E
    A B C D
      A B C
        A B
          A

 */
// import java.util.Scanner;

// public class pattern21 {
//     public static void main(String[] args) {
//         try (Scanner obj = new Scanner(System.in)) {
//             System.out.print("Enter value: ");

//             int val = obj.nextInt();
//             int Asciival = 70;

//             for (int i = 1; i <= val; i++) {
//                 for (int k = 1; k <= i; k++) {
//                     System.out.print("  ");
//                 }
//                 for (int j = val; j >= i; j--) {
//                     int Asciival1 = Asciival-j;
//                     System.out.print((char) Asciival1 + " ");
//                 }
//                 System.out.println(" ");
//             }
//         }
//     }
// }


/*
  
  E D C B A
    E D C B
      E D C
        E D
          E

 */


//  import java.util.Scanner;

//  public class pattern21 {
//      public static void main(String[] args) {
//          try (Scanner obj = new Scanner(System.in)) {
//              System.out.print("Enter value: ");
 
//              int val = obj.nextInt();
//              int Asciival = 64;
 
//              for (int i = 1; i <= val; i++) {
//                  for (int k = 1; k <= i; k++) {
//                      System.out.print("  ");
//                  }
//                  for (int j = val; j >= i; j--) {
//                      int Asciival1 = Asciival+j;
//                      System.out.print((char) Asciival1 + " ");
//                  }
//                  System.out.println(" ");
//              }
//          }
//      }
//  }


 /*
  
  E D C B A
    D C B A
      C B A
        B A
          A

 */


 import java.util.Scanner;

 public class pattern21 {
     public static void main(String[] args) {
         try (Scanner obj = new Scanner(System.in)) {
             System.out.print("Enter value: ");
 
             int val = obj.nextInt();
             int Asciival = 64;
 
             for (int i = 0; i <= val; i++) {
                 for (int k = 1; k <= i; k++) {
                     System.out.print("  ");
                 }
                 for (int j = val-i; j >= 1; j--) {
                     int Asciival1 = Asciival+j;
                     System.out.print((char) Asciival1 + " ");
                 }
                 System.out.println(" ");
             }
         }
     }
 }
