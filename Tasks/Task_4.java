class Task_4 {
    public static void main (String args[]){
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int n = 4;
        int c = 0;
        int l = 0;
        int newArray[];

        for (int i = 0; i < array.length; i++){
            if(array[i] != n)
                l++;
        }

        newArray = new int[l];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != n) {
                newArray[i - c] = array[i];
            } else {
                c += 1;
            }
        }

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}