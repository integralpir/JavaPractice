import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class Task_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            list.add(key);
            map.put(key, value);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++){
            int key = list.get(i);
            if (key + map.get(key) <= list.get(i+1)) counter++;
            else if(key == list.get(i+1)) counter++;
        }
        System.out.println(counter);
    }
}
