import java.io.*;

public class Stepic_2_5_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine()), i = 0, j = 0, k = 2;
        int [][] matrix = new int[n][n];
        matrix[0][0] = 1;

        while (k <= n*n){
            if ((j + 1) < n && matrix[i][j+1] == 0){
                while (true){
                    try{
                        matrix[i][++j] = k++;
                    } catch (Exception e){
                        j--;
                        break;
                    }
                }
            } else if ((i + 1) < n && matrix[i+1][j] == 0){
                while (true){
                    try{
                        matrix[++i][j] = k++;
                    } catch (Exception e){
                        i--;
                        break;
                    }
                }
            } else if ((j - 1) >= 0 && matrix[i][j-1] == 0){
                while (true){
                    try{
                        matrix[i][--j] = k++;
                    } catch (Exception e){
                        j++;
                        break;
                    }
                }
            } else if ((i - 1) >= 0 && matrix[i-1][j] == 0){
                while (true){
                    try{
                        matrix[--i][j] = k++;
                    } catch (Exception e){
                        i++;
                        break;
                    }
                }
            }
        }

        for (int z = 0; z < n; z++){
            for (int f = 0; f < n; f++){
                System.out.print(f == (n - 1) ? matrix[z][f] : matrix[z][f] + " ");
            }
            System.out.println();
        }
    }
}
