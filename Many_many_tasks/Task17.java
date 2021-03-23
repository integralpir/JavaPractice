import java.util.*;

public class Task17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 0;
        int p = 0;
        while (x < N){
            p++;
            x = (int) Math.pow(2, p);
        }

        if ((x == N && x != 0) || N == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
