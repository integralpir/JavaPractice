import java.util.Scanner;

class Stepic2_5_4 {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();
        int i = 1;
        int array[][] = new int[n][m];

        for (int j = 0; j < m; j++){
            if (j % 2 == 0){
                for (int k = 0; k < n; k++){
                    array[k][j] = i++;
                }
            } else {
                for (int k = (n - 1); k >= 0; k--){
                    array[k][j] = i++;
                }
            }
        }

        for (int j = 0; j < n; j++){
            for (int k = 0; k < m; k++){
                System.out.print(array[j][k] + " ");
            }
        System.out.println();
        }
    }
}