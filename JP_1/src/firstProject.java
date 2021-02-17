import java.util.Arrays;
import java.util.Scanner;

public class firstProject{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        switch (number) {
            case 1:
                int x = scn.nextInt();
                String n;
                if (x % 2 == 0){
                    n = "Чётное";
                } else {
                    n = "Нечетное";
                }
                System.out.println(n);
            case 2:
                int z = scn.nextInt();
                int y = scn.nextInt();
                String n1 = null;
                if (z > y){
                    if (z % y == 0){
                        n1 = z + " кратно " + y;
                    }
                } else {
                    if (y % z == 0){
                        n1 = y + " кратно " + z;
                    }
                }
                System.out.println(n1);
            case 3:
                int[] A = new int[3];
                A[0] = scn.nextInt();
                A[1] = scn.nextInt();
                A[2] = scn.nextInt();
                Arrays.sort(A);
                System.out.println(A[0]);
            case 4:
                int a = scn.nextInt();
                int b = scn.nextInt();
                int c = scn.nextInt();
                if ((a + b) > c || (c + b) > a || (c + a) > b){
                    System.out.println("Можно построить треугольник");
                } else {
                    System.out.println("Нельзя построить треугольник");
                }
            case 5:
                int r = scn.nextInt();
                double S = 2 * Math.PI * r;
                double L = Math.PI * r * r;
                System.out.println("Площадь = " + S + ", длина равна = " + L);
            case 6:
                double R = scn.nextDouble();
                double B = scn.nextDouble();
                double C = scn.nextDouble();
                double X1;
                double X2;
                double D = (B * B - 4 * R * C);
                if (D < 0){
                    System.out.println("Корней нет");
                } if (D == 0) {
                    X1 = (-B / 2 * R);
                    System.out.println(X1);
                } else {
                    X1 = ((-B + Math.sqrt(D)) / (2 * R));
                    X2 = ((-B - Math.sqrt(D)) / (2 * R));
                    System.out.println(X1 + " " + X2);
                }
        }
    }
}
