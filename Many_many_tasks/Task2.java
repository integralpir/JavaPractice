import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        if (n < 0){
            for (int i = 1; i >= n; i--)
                s += i;
        }else if (n > 0){
            for (int i = 1; i <= n; i++)
                s += i;
        }else{
            s = 1;
        }
        System.out.println(s);
    }
}
