import java.util.*;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        int n = scanner.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();

        while (true){
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (key == 0 && value == 0) break;
            if (key >= 0 && key < n && key + value <= n) map.put(key, value);
        }


        for (Integer key : map.keySet()){
            if (map.get(key) + key <= n){
                count++;
                n -= map.get(key);
            }
        }

        System.out.println(count == 0 ? -1 : count);
    }
}
