public class pattern17 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("    "); // 4 spaces for alignment
            }

            // Print decreasing numbers
            int num = n - i + 1;
            for (int j = 0; j < i; j++) {
                System.out.print(num + "   ");
                num--;
            }

            // Print increasing numbers
            num = num + 2; // Reset to the number after the smallest
            for (int j = 1; j < i; j++) {
                System.out.print(num + "   ");
                num++;
            }

            System.out.println(); // Move to the next row
        }
    }
}


/*   

                5   
            4   3   4   
        3   2   1   2   3   
    2   1   0   -1   0   1   2   
1   0   -1   -2   -3   -2   -1   0   1  

 */
