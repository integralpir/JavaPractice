import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countBundles = 0;
        int countStickers = 0;
        int size = 9;
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                size--;
                if (size == 0){
                    countBundles++;
                    countStickers += ((m - j) * 6);
                    size = 9;
                    break;
                }
            }
        }
        if (countBundles == 0){
            System.out.println(countBundles);
            System.out.println(m * 6);
        } else {
            System.out.println(countBundles);
            System.out.println(countStickers);
        }
    }
}
