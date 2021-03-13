/*
Программа поиска простых чисел
в диапазоне от 2 до 100
 */

class Task_3 {
    public static void main(String args[]) {
        int arrays[] = new int[98];
        for (int i = 2; i < arrays.length; i++)
            arrays[i] = i;

        for (int i = 0; i < arrays.length; i++){
            int count = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0)
                    count += 1;
            }
            if (count == 2)
                System.out.print(arrays[i] + " ");
        }
    }
}