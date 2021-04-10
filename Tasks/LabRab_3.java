import java.util.Scanner;

public class LabRab_3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        int choice = scanner.nextInt();

        switch (choice){
            case (1) -> firstTask(n);
            case (2) -> secondTask(n);
            case (3) -> thirdTask(n);
            case (4) -> fourthTask(n);
            case (5) -> fifthTask(n);
            case (6) -> sixthTask(n);
            case (7) -> seventhTask(n);
        }
    }

    public static void firstTask(int n){
        for (int i = 0; i < n; i++)
            System.out.print("X");
    }

    public static void secondTask(int n){
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++)
                System.out.print("X");
            System.out.println();
        }
    }

    public static void thirdTask(int n) {
        for (int j = 0; j < n; j++) {
            char symbol;
            if (j % 2 == 0)
                symbol = 'X';
            else
                symbol = '-';

            for (int i = 0; i < n; i++)
                System.out.print(symbol);
            System.out.println();
        }
    }

    public static void fourthTask(int n){
        char[][] tabs = new char[n][n];
        for (char[] tab : tabs){
            for (int i = 0; i < tab.length; i ++){
                if (i % 2 == 0)
                    tab[i] = 'X';
                else
                    tab[i] = '-';
            }
            System.out.println(tab);
        }
    }

    public static void fifthTask(int n){
        char[][] tabs = new char[n][n];
        int i = 0;
        for (char [] tab : tabs) {
            for (char sym : tab)
                sym = '-';
            tab[i] = 'X';
            i++;
            System.out.println(tab);
        }
    }

    public static void sixthTask(int n){
        char[][] tabs = new char[n][n];
        int i = n - 1;
        for (char [] tab : tabs) {
            for (char sym : tab)
                sym = '-';
            tab[i] = 'X';
            i--;
            System.out.println(tab);
        }
    }

    public static void seventhTask(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; i >= j; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
