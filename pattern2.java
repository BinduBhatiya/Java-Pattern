import  java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter Value: ");
            
            int val = obj.nextInt();

            for (int i = 1; i <= val; i++) {
                for (int k = val-1; k >=i ; k--) {
                    System.out.print(" ");
                }
                for (int j = 1; j < i+1 ; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
        }
    }
}

/*
output : 

Enter Value: 5

     *
    * *
   * * *
  * * * *
 * * * * *

*/
