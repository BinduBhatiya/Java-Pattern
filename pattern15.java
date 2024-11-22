import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter Row: ");

            int n = obj.nextInt();
            int Asciival = 64;

            for (int i = 1; i <= n; i++) {
                for (int k = n; k >= i; k--) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    int Asciival2 = Asciival + j;
                    System.out.print((char) Asciival2 + " ");
                }
                if(i > 1){
                    for (int j = 1; j < i; j++) {
                        int Asciival2 = (Asciival+1) + j;
                        System.out.print((char) Asciival2 + " ");
                    }
                }
                System.out.println(" ");
            }
            for (int i = 1; i <= n; i++) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("  ");
                }
                for (int j = n-i; j >= 1; j--) {
                    int Asciival2 = Asciival + j;
                    System.out.print((char) Asciival2 + " ");
                }
                if(i >= 1){
                    for (int j = 1; j < n-i; j++) {
                        int Asciival2 = (Asciival+1) + j;
                        System.out.print((char) Asciival2 + " ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
