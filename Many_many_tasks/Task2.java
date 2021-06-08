import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int zeroCounter = 0, oneCounter = 0;
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++){
                int x = Integer.parseInt(reader.readLine());
                if (x == 0) {
                    zeroCounter++;
                } else {
                    oneCounter++;
                }
            }

            System.out.println(Math.min(zeroCounter, oneCounter));
        } catch (IOException e){
        }
    }
}
