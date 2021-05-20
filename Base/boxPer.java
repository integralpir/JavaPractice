class box {
    double width;
    double height;
    double depth;

    double per() { // с возвратом
        return width + height + depth;
    }

    double volume() { // без возврата вместо double будет void
        return width * height * depth;
    }
                                               // это конструктор если что
    void setDim(double w, double h, double d){ // правильнее задавать переменные для класса в самом классе
        width = w;                             // чтобы только у класса был доступ к инициализации переменных
        height = h;
        depth = d;
    }
}

class boxPer {
    public static void main(String args[]){
        box myBox1 = new box();
        box myBox2 = new box();

        myBox1.setDim(10,20,15);   // инициализация экземпляров класса
        myBox2.setDim(3, 5,9);

        System.out.println(myBox1.per());
        System.out.println(myBox1.volume());
        System.out.println();
        System.out.println(myBox2.per());
        System.out.println(myBox2.volume());
    }
}