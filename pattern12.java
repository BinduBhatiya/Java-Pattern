public class pattern12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }

            for (int k = (5-1); k >=i ; k--) {
                System.out.print("  ");
            }
            for (int k = (5-1); k >=i ; k--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
            }
            System.out.println("");
        }
        for (int i = 5; i > 1; i--){
            for (int j = i; j > 1; j--) {
                System.out.print(j+" ");
            }

            for (int k = (5-1); k >=i ; k--) {
                System.out.print("  ");
            }
            for (int k = (5+1); k >=i ; k--) {
                System.out.print("  ");
            }

            for (int j = 2; j <= i; j++) {
                    System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}


/*

1                 1 
2 1             1 2 
3 2 1         1 2 3 
4 3 2 1     1 2 3 4 
5 4 3 2 1 1 2 3 4 5 
5 4 3 2     2 3 4 5 
4 3 2         2 3 4 
3 2             2 3 
2                 2 

 */