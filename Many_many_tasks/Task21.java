import java.util.*;

public class Task21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 1; i <= numbers.length; i++)
            numbers[numbers.length - i] = scanner.nextInt();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
