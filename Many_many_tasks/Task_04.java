import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = reader.readLine().split("");
        String[] str2 = reader.readLine().split("");
        int count = 0;
        for (int i = 0; i < str1.length; i++){
            if (str1[i].equals(str2[i])){
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
