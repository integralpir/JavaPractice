import java.util.*;

public class Task11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a * b == c)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
