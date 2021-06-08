import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task_06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] map = new String[n];

        for (int i = 0; i < n; i++){
            map[i] = scanner.next();
        }
        List<Integer> numbers = new ArrayList<>();


        for (int i = 1; i <= n; i++){
            numbers.add(i);
        }


        for (int i = (map.length - 1); i >= 0; i--){
            int x = Integer.parseInt(map[i]);
            if (x == 0){
                map[i] = String.valueOf(numbers.get(numbers.size() - 1));
                numbers.remove(numbers.get(numbers.size() - 1));
            } else {
                map[i] = String.valueOf(numbers.get(numbers.size() - x - 1));
                numbers.remove(numbers.size() - x - 1);
            }
        }

        System.out.println(String.join(" ", map));
    }
}
