import  java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter Value: ");
            int num = obj.nextInt();

            int val = 1;
            for (int i = 1; i < num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(val+" ");
                    val = val + 1; 
                }

                System.out.println("");
            }
        }
    }
}

/*

 Enter Value: 5

1
2 3
4 5 6
7 8 9 10

 */
