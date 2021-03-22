import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = a / 10;
        if (b == 0)
            System.out.println(a * a);
        else
            System.out.println((b * (b + 1)) * 100 + 25);
    }
}
