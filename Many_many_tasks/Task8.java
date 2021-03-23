import java.util.*;

public class Task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = (a + b) - 1;
        System.out.print(n - a);
        System.out.print(" ");
        System.out.print(n - b);
    }
}
