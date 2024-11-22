/*

A
A B
A B C
A B C D
A B C D E

 */
import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter value: ");

            int val = obj.nextInt();
            int Asciival = 65;

            for (int i = 1; i <= val; i++) {
                for (int j = 0; j < i; j++) {
                    int Asciival1 = Asciival+j;
                    System.out.print((char) Asciival1 + " ");
                }
                System.out.println(" ");
            }
        }

    }
}
