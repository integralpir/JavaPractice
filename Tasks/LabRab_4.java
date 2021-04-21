import java.io.*;
import java.nio.file.*;
import java.util.*;


public class LabRab_4 {
    public static Scanner scanner = new Scanner(System.in);
    public static String src = "inputLR4.txt";
    public static String dest = "outputLR4.txt";

    public static void main(String[] args){
        int choice = scanner.nextInt();
        switch (choice){
            case(1) -> Task_1();
            case(2) -> Task_2();
            case(3) -> Task_3();
            case(4) -> Task_4();
            case(5) -> Task_5();
            case(6) -> Task_6();
            case(7) -> Task_7();
        }
    }

    public static void Task_1(){
        try{
            List<String> list = Files.readAllLines(Paths.get(src));
            for (String line : list)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("Something got wrong");
        }
    }

    public static void Task_2(){
        try{
            List<String> list = Files.readAllLines(Paths.get(src));
            for (int i = 0; i < list.size(); i++){
                if (i % 2 != 0)
                    System.out.println(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("Something got wrong");
        }
    }

    public static void Task_3(){
        try (FileReader reader = new FileReader(src); FileWriter writer = new FileWriter(dest)){
            char[] buffer = new char[65536];
            while(reader.ready()){
                int real = reader.read(buffer);
                writer.write(buffer, 0 , real);
            }
        } catch (IOException e){
            System.out.println("Something got wrong");
        }
    }

    public static void Task_4(){
        try(var reader = new FileReader(src);
            var buffer = new BufferedReader(reader)) {
            int sum = 0;
            var list = new ArrayList<String[]>();
            while (buffer.ready()){
                String str = buffer.readLine();
                list.add(str.split(" "));
            }
            for (String[] tab : list) {
                for (String s : tab) {
                    sum += Integer.parseInt(s);
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            System.out.println("Something got wrong");
        }
    }

    public static void Task_5(){
        try(var reader = new FileReader(src);
            var buffer = new BufferedReader(reader)){
            var summary = new ArrayList<Integer>();
            var list = new ArrayList<String[]>();
            while (buffer.ready()){
                String str = buffer.readLine();
                list.add(str.split(" "));
            }
            for (String[] tab : list) {
                int sum = 0;
                for (String s : tab) {
                    sum += Integer.parseInt(s);
                }
                summary.add(sum);
            }
            int index = summary.indexOf(Collections.max(summary));
            System.out.println(Arrays.toString(list.get(index)));
        } catch (IOException e){
            System.out.println("Something got wrong");
        }
    }

    public static void Task_6(){
        int mainSum = 0;
        int addSum = 0;
        try(var reader = new FileReader(src);
            var buffer = new BufferedReader(reader))
        {
            var list = new ArrayList<String[]>();

            while (buffer.ready()){
                String str = buffer.readLine();
                list.add(str.split(" "));
            }

            for (int i = 0; i < list.size(); i++){
                mainSum += Integer.parseInt(list.get(i)[i]);
                addSum += Integer.parseInt(list.get(i)[list.size() - i - 1]);
            }

            System.out.printf("%d %d", mainSum, addSum);
        } catch (IOException e){
            System.out.println("Something got wrong");
        }
    }

    public static void Task_7(){
        try(var reader = new FileReader(src);
            var buffer = new BufferedReader(reader))
        {
            var list = new ArrayList<String[]>();
            while (buffer.ready()){
                String str = buffer.readLine();
                list.add(str.split(" "));
            }

            String[][] tabs = new String[list.size()][list.get(0).length];
            for (int i = 0; i < tabs.length; i++){
                for (int j = 0; j < tabs[i].length; j++){
                    tabs[i][j] = list.get(j)[i];
                }
                System.out.println(Arrays.toString(tabs[i]));
            }
        } catch (IOException e){
            System.out.println("Something got wrong.");
        }
    }
}
