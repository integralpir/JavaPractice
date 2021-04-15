import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.Paths.*;

public class LabRab_4 {
    public static Scanner scanner = new Scanner(System.in);
    public static String src = "input.txt";
    public static String dest = "output.txt";

    public static void main(String[] args){
        int choice = scanner.nextInt();
        switch (choice){
            case(1) -> Task_1();
            case(2) -> Task_2();
            case(3) -> Task_3();
            case(4) -> Task_4();
            case(5) -> Task_5();
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
        try (var reader = new FileReader(src);
             var buffer = new BufferedReader(reader)) {
            int sum = 0;
            while (reader.ready()){
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
            }
        } catch (IOException e) {
            System.out.println("Something got wrong");
        }
    }

    public static void Task_5(){

    }
}
