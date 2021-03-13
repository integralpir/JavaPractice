/*
Реализация метода сортировки пузырьком
 */

class Task_2 {
    public static void main(String args[]){
        int a = 0;
        int b = 10;
        int arrays[] = new int[b];
        for (int i = 0; i < arrays.length; i++)
            arrays[i] = a + (int) (Math.random() * b);

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arrays.length; i++)
            System.out.print(arrays[i] + " ");
    }
}