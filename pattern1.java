import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter Value: ");

            int value = myObj.nextInt();  // Read user input

            for (int i = 1; i <= value; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
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
**
***
****
*****

*/