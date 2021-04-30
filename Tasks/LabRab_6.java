import java.io.*;
import java.util.*;

public class LabRab_6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        var choice = scanner.nextInt();
        switch (choice){
            case (1) -> Task_1();
            case (2) -> Task_2();
            case (3) -> Task_3();
            case (4) -> Task_4();
        }
    }

    public static void Task_1(){
        var paymentList = new ArrayList<Integer>();
        var n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            paymentList.add(scanner.nextInt());
        }
        System.out.println(Collections.max(paymentList) / Collections.min(paymentList));
    }

    public static void Task_2(){
        String example = scanner.next();
        int xIndex = example.indexOf("x");
        String[] list = example.split("");
        if (xIndex == 4){
            if (list[1].equals("-"))
                System.out.println(Integer.parseInt(list[0]) - Integer.parseInt(list[2]));
            else if (list[1].equals("+"))
                System.out.println(Integer.parseInt(list[0]) + Integer.parseInt(list[2]));
        } else {
            int numIndex = (xIndex == 0 ? 2 : 0);
            if (list[1].equals("-"))
                System.out.println(Integer.parseInt(list[numIndex]) - Integer.parseInt(list[4]));
            else if (list[1].equals("+"))
                System.out.println(Integer.parseInt(list[numIndex]) + Integer.parseInt(list[4]));
        }
    }

    public static void Task_3(){
        String src = "inputLR6.txt";
        HashMap<Integer, String> list = new HashMap<>();

        try(FileReader in = new FileReader(src);
            BufferedReader reader = new BufferedReader(in))
        {
            while (reader.ready()){
                String[] line = reader.readLine().split(" ");
                list.put(Integer.parseInt(line[0]), line[1]);
            }
        } catch (IOException e){
            System.out.println("Something got wrong!");
        }

        for (Integer key : list.keySet()){
            int summary = 0;
            for (int i = 1; i <= key; i++){
                if (key % i == 0) summary += i;
            }
            if (summary % 2 != 0)
                System.out.println(list.get(key));
        }
    }

    public static void Task_4() {
        String[] chipSet = scanner.next().split("1");
        String max = Arrays.stream(chipSet).max((s1, s2) -> s1.length() - s2.length()).get();
        System.out.println(max.length());
    }

    
}
