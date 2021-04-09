import java.util.*;

public class labRab_1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int choice = scanner.nextInt();
        switch (choice) {
            case (1) -> firstTask();
            case (2) -> secondTask();
            case (3) -> thirdTask();
            case (4) -> fourthTask();
            case (5) -> fifthTask();
            case (6) -> sixthTask();
        }

    }

    public static void firstTask(){
        int x = scanner.nextInt();
        if (x % 2 == 0)
            System.out.println("Четное.");
        else
            System.out.println("Нечетное.");
    }

    public static void secondTask(){
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int min;
        int max;
        String result;
        if (x >= y){
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }

        if (max % min == 0)
            result = String.format("%d кратно %d", max, min);
        else
            result = String.format("%d не кратно %d", max, min);

        System.out.println(result);
    }

    public static void thirdTask(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            int x = scanner.nextInt();
            list.add(x);
        }
        System.out.println(Collections.min(list));
    }

    public static void fourthTask(){
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x + y <= z || z + y <= x || z + x <= z)
            System.out.println("Нет");
        else
            System.out.println("Да");
    }

    public static void fifthTask(){
        double r = scanner.nextDouble();
        System.out.println(2 * Math.PI * r);
        System.out.println(Math.PI * Math.pow(r, 2));
    }

    public static void sixthTask(){
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double D = (Math.pow(b, 2) - (4 * a * c));

        if (D < 0)
            System.out.println("Корней нет.");
        else if (D == 0)
            System.out.println(-b / (2 * a));
        else {
            System.out.println((-b + Math.sqrt(D)) / (2 * a));
            System.out.println((-b - Math.sqrt(D)) / (2 * a));
        }
    }

}
