import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter Value: ");

            int value = myObj.nextInt();  // Read user input

            for (int i = 1; i < value; i++) {
                for (int k = value-1; k >=i ; k--) {
                    System.out.print(" ");
                }
                for (int j = 1; j < 5; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}


/*

 Enter Value: 5

    ****
   ****
  ****
 ****

 */
