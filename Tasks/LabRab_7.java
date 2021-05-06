import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class LabRab_7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int choice = scanner.nextInt();
        switch (choice){
            case (1) -> Task_1();
            case (2) -> Task_2();
            case (3) -> Task_3();
            case (4) -> Task_4();
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

    public static void Task_3(){
        int x = (int) (Math.random() * 999);
        for (int i = 1; i <= 10; i++){
            int choice = scanner.nextInt();
            if (choice == x){
                System.out.println("Осталось печенек: " + i);
                return;
            } else if (choice > x) {
                System.out.println("Число больше загаданного");
            } else {
                System.out.println("Число меньше загаданного");
            }
        }

        System.out.println("Вы проиграли...");
    }

    public static void Task_4(){
        String src = "D:\\Java_Projects\\Tasks\\steps.txt";
        ArrayList<List<Integer>> list = new ArrayList<>();
        int rightSteps = 0, leftSteps = 0;
        try(FileReader fileReader = new FileReader(src);
            BufferedReader reader = new BufferedReader(fileReader))
        {
            while (reader.ready()){
                List<Integer> line = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                list.add(line);
            }

            for(List<Integer> line : list){
                rightSteps += (line.get(0) * line.get(2));
                leftSteps += (line.get(1) * line.get(2));
            }

            System.out.println(Math.abs(rightSteps - leftSteps) / 100);
        } catch (IOException e){
            System.out.println("Something got wrong!!");
        }
    }
}
