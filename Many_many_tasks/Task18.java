import java.util.*;

public class Task18 {
    public static int counter(int n, Scanner scanner) {
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x == 1)
                ones++;
            else
                zeros++;
        }
        return Math.min(zeros, ones);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.println(counter(A, scanner));
    }
}
