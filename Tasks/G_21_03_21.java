import java.util.Scanner;
public class G_21_03_21 {
    static public void main(String args[]){
        Scanner console = new Scanner(System.in);
        double T = console.nextDouble();
        double K = console.nextDouble();

        if (T <= K){
            System.out.println((long)(T + 1));
        } else{
            System.out.println((long) (T + Math.ceil(T / K)));
        }
    }
}
