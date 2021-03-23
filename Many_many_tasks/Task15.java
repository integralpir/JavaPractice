import java.util.*;

public class Task15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (n / 3) / 2;
        int c = a;
        int b = (a + c) * 2;

        System.out.println(a + " " + b + " " + c);
    }
}
