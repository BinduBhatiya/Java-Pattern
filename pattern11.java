import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter Value: ");

            int n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i + j) % n + 1);
            }
            System.out.println("");
        }
    }
    }
}


/*

Enter Value: 5

12345
23451
34512
45123
51234

 */
