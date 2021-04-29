import java.time.LocalTime;
import java.util.*;

public class LabRab_7 {
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
        String[] timeCase = scanner.next().split(":");
        int plusSec = scanner.nextInt();
        LocalTime time = LocalTime.of(Integer.parseInt(timeCase[0]), Integer.parseInt(timeCase[1]), Integer.parseInt(timeCase[2]));
        System.out.println(time.plusSeconds(plusSec));
    }

    public static void Task_2(){
        var str = new StringBuilder(scanner.next().toLowerCase(Locale.ROOT));
        String[] lessFull = {",", ".", "!", "?"};
        for (String s : lessFull){
            int index;
            while (true){
                index = str.indexOf(s);
                if (index != -1)
                    str.deleteCharAt(index);
                else
                    break;
            }
        }
        String Str = String.valueOf(str);
        String reverseStr = String.valueOf(str.reverse());
        System.out.println(Str.equals(reverseStr) ? "YES" : "NO");
    }

    public static void Task_3(){}
}
