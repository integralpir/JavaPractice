import java.util.*;

public class Task19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int W, H, R;
        W = scanner.nextInt();
        H = scanner.nextInt();
        R = scanner.nextInt();
        if ((R * 2) <= H && (R * 2) <= W)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
