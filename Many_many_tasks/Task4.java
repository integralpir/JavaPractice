import java.util.*;


public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List times = new ArrayList();
        for (int i = 0; i < n; i++)
            times.add(scanner.nextInt());

        int a, b, c;
        a = 0;
        b = 0;
        c = 0;

        for (int i = 0; i < times.size(); i++)
            c += ((int) times.get(i) * (times.size() - i));
        c = 300 - c;
        Collections.reverse(times);

        for (int i = 0; i < times.size(); i++)
            b += ((int) times.get(i) * (times.size() - i));
        b = 300 - b;
        Collections.sort(times);

        for (int i = 0; i < times.size(); i++)
            a += ((int) times.get(i) * (times.size() - i));
        a = 300 - a;
        if (a >= b){
            if (a >= c){
                System.out.println(1);
            } else {
                System.out.println(3);
            }
        } else if (b >= c){
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
