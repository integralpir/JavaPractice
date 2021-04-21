import java.util.*;

public class LabRab_5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int choice = scanner.nextInt();
        switch (choice){
            case (1) -> Task_1();
            case (2) -> Task_2();
            case (3) -> Task_3();
        }
    }

    public static void Task_1(){
        int n = scanner.nextInt();
        int sum = 0;
        if (n > 0){
            for (int i = 1; i <= n; i++)
                sum += i;
        } else
            for (int i = 1; i >= n; i--)
                sum += i;
        System.out.println(sum);
    }

    public static void Task_2(){
        int s = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= s; i++){
            for (int j = 1; j <= s; j++){
                if (i * j == s) count++;
            }
        }
        System.out.println(count / 2);
    }

    public static void Task_3(){
        String[] loot = (scanner.next().split(""));
        int[] result = new int[9];
        for (String s : loot){
            result[Integer.parseInt(s) - 1]++;
        }
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] == 0 ? "" : Integer.toString(result[i]) + Integer.toString(i + 1));
        }
    }
}
