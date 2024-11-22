/*
  
A B C D E
A B C D
A B C  
A B
A

 */
import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter value: ");

            int val = obj.nextInt();
            int Asciival = 70;

            for (int i = 1; i <= val; i++) {
                for (int j = val; j >= i; j--) {
                    int Asciival1 = Asciival-j;
                    System.out.print((char) Asciival1 + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
