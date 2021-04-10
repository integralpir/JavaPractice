import java.util.Scanner;

public class LabRab_2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int choice = scanner.nextInt();
        switch (choice){
            case (1) -> firstTask();
            case (2) -> secondTask();
            case (3) -> thirdTask();
            case (4) -> fourthTask();
            case (5) -> fifthTask();
        }
    }

    public static void firstTask(){
        int x = scanner.nextInt();
        int sum = 0;
        String[] str = Integer.toString(x).split("");
        for (String a : str){
            int i = Integer.parseInt(a);
            sum += i;
        }
        System.out.println(sum);
    }

    public static void secondTask(){
        int x = scanner.nextInt();
        int result = 2;
        while (true) {
            result *= 2;
            if (x == result) {
                System.out.println("Да");
                break;
            } else if (result > x) {
                System.out.println("Нет");
                break;
            }
        }
    }

    public static void thirdTask(){
        int x = scanner.nextInt();
        System.out.println(Integer.toOctalString(x));
    }

    public static void fourthTask(){
        int n = scanner.nextInt();
        double a = 2;
        double b = 1;
        double sum = 0;
        for (int i = 0; i < n; i++){
            sum += a / b;
            if (i % 2 == 0)
                b += 2;
            else
                a += 2;
        }

        System.out.println(sum);
    }

    public static void fifthTask(){
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for (int k = n - i; k > 0; k--)
                System.out.print(" ");

            for (int j = i; j > 0; j--)
                System.out.print("X");

            for (int z = i - 1; z > 0; z--)
                System.out.print("X");

            System.out.println();
        }
    }
}
