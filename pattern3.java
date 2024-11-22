import  java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter Value: ");

            int val = obj.nextInt();

            for (int i = 1; i <= val; i++) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println("");
            }
        }
    }
}


/*
output : 

Enter Value: 5

1
21
321
4321
54321

*/