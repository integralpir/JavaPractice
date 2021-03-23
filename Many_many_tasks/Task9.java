import java.util.*;

public class Task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] pay = new int[3];
        for (int i = 0; i < pay.length; i++)
            pay[i] = scanner.nextInt();

        Arrays.sort(pay);
        System.out.println(pay[2] - pay[0]);
    }
}
