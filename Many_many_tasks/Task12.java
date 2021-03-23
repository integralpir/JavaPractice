import java.util.*;

public class Task12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        for (int i = 0; i < 4; i++){
            a += scanner.nextInt();
            b += scanner.nextInt();
        }
        if (a > b)
            System.out.println(1);
        else if (b > a)
            System.out.println(2);
        else
            System.out.println("DRAW");
    }
}
