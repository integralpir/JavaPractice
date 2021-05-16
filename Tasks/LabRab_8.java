import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;


public class LabRab_8 {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder firstTaskMessage = new StringBuilder("68747470733A2F2F70636F64696E672E72752F7478742F776F7264732E747874");
    public static StringBuilder cite = new StringBuilder("https://pcoding.ru/txt/words-utf8.txt");
    public static HashMap<Character, Integer> numbers = new HashMap<>()
    {{
        put('A', 10);
        put('B', 11);
        put('C', 12);
        put('D', 13);
        put('E', 14);
        put('F', 15);
    }};

    public static void main(String[] args) throws IOException {
        int choice = Integer.parseInt(reader.readLine());
        switch (choice){
            case (1) -> Task_1();
            case (2) -> Task_2();
            case (3) -> Task_3();
        }
    }

    public static void Task_1(){
        while (firstTaskMessage.length() != 0){
            var smb = firstTaskMessage.substring(0, 2).toCharArray();
            int x = (Character.isDigit(smb[0]) ? (Integer.parseInt(String.valueOf(smb[0])) * 16) : (numbers.get(smb[0]) * 16)) + (Character.isDigit(smb[1]) ? (Integer.parseInt(String.valueOf(smb[1]))) : (numbers.get(smb[1])));
            cite.append((char) x);
            firstTaskMessage.delete(0, 2);
        }
        System.out.println(cite);
    }

    public static void Task_2() throws IOException {
        String[] wantedWords = {"матрица", "ячейка", "избранный"};
        int i = 20;

        URL url = new URL(String.valueOf(cite));
        InputStream input = url.openStream();

        byte[] buffer = input.readAllBytes();
        String[] str = (new String(buffer)).split("\n");

    }

    public static void Task_3(){

    }
}
