/*

Enter value: 5
        A
      B A B
    C B A B C
  D C B A B C D
E D C B A B C D E
  D C B A B C D
    C B A B C
      B A B
        A 
        
*/


import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter value: ");
            int n = obj.nextInt();

            // Upper triangle
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int k = 1; k <= (n - i) * 2; k++) {
                    System.out.print(" ");
                }

                // Print decreasing characters
                char ch = (char) ('A' + i - 1);
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch-- + " ");
                }

                // Print increasing characters
                ch = 'B';
                for (int j = 1; j < i; j++) {
                    System.out.print(ch++ + " ");
                }

                System.out.println();
            }

            // Lower triangle
            for (int i = 1; i < n; i++) {
                // Print spaces
                for (int k = 1; k <= i * 2; k++) {
                    System.out.print(" ");
                }

                // Print decreasing characters
                char ch = (char) ('A' + n - i - 1);
                for (int j = i; j < n; j++) {
                    System.out.print(ch-- + " ");
                }

                // Print increasing characters
                ch = 'B';
                for (int j = i + 1; j < n; j++) {
                    System.out.print(ch++ + " ");
                }

                System.out.println();
            }
        }
    }
}
