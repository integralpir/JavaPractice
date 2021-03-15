public class forEach {
    public static void main(String args[]){
        int numbers [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int x : numbers)
            sum += x;
        System.out.println(sum);
    }
}
