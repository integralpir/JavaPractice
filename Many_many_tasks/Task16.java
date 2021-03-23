import java.util.*;

public class Task16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] fats = new int[3];
        for (int i = 0; i < fats.length; i++)
            fats[i] += scanner.nextInt();

        Arrays.sort(fats);
        if (fats[2] > 727 || fats[0] < 94)
            System.out.println("Error");
        else
            System.out.println(fats[2]);
    }
}
