import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int x = scanner.nextInt();
        int k = 0;
        int low = 0, up = 0;
        String[] upperBinX = Integer.toBinaryString(x).split("");
        String[] lowerBinX = Integer.toBinaryString(x).split("");

        while (true){
            upperBinX[upperBinX.length - k - 1] = "1";
            lowerBinX[lowerBinX.length - k - 1] = "0";

            if (Integer.parseInt(String.join("", upperBinX), 2) > r) break;
            if (Integer.parseInt(String.join("", lowerBinX), 2) < l) break;

            up = Integer.parseInt(String.join("", upperBinX), 2);
            low = Integer.parseInt(String.join("", lowerBinX), 2);
            k++;
        }

        System.out.println(k + " " + low + " " + up);
    }
}
