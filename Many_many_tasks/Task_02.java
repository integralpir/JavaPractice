import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> counter = new ArrayList<Integer>();
        int count = 0;
        int i = 0;
        StringBuilder str = new StringBuilder(reader.readLine());
        while (i < str.length()){
            if (str.length() - i >= 3){
                if (str.substring(i, i+3).equals("LDR")){
                    count += 3; i += 3;
                } else if (str.substring(i, i+2).equals("LD")){
                    count += 2; i += 2; counter.add(count); count = 0;
                } else if (str.substring(i, i+1).equals("L")){
                    count++; i++; counter.add(count); count = 0;
                } else {
                    i++; counter.add(count); System.out.println(count); count = 0;
                }
            } else if (str.length() - i == 2){
                if (str.substring(i, i+2).equals("LD")){
                    count += 2; i += 2;
                } else if (str.substring(i, i+1).equals("L")){
                    count++; i++; counter.add(count); count = 0;
                } else {
                    i++; counter.add(count); System.out.println(count); count = 0;
                }
            } else if (str.length() - i == 1){
                if (str.substring(i, i+1).equals("L")){
                    count++; i++;
                } else {
                    i++; counter.add(count); System.out.println(count); count = 0;
                }
            }
        }
        counter.add(count);
        System.out.println(Collections.max(counter));
    }
}