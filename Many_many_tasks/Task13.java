import java.util.*;

public class Task13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int res = (scanner.nextInt() + scanner.nextInt()) - scanner.nextInt();
        if (res >= 0)
            System.out.println(res);
        else
            System.out.println("Impossible");
    }
}
