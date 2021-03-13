/*
Выявление максимального, минимального значения
и среднего арифметического случайно сгенерированного
списка
 */

class Task_1 {
    public static void main(String args[]){
        int n = 100;
        double numbers[] = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }
        double max, min, avg;
        max = 0;
        min = 1;
        avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
            if (min > numbers[i])
                min = numbers[i];
            avg = avg + numbers[i];
        }
        avg = avg / numbers.length;
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }
}