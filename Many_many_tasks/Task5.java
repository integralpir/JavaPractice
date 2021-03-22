import java.util.*;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N, M, K;
        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();

        if ((N * M) >= K)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
