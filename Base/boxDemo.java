class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth){ //конструктор класса
        System.out.println("LEGO");    //так будет супер круто и супер правильно
        this.width = width;            //this - ключевое слово, оно всегда ссылается на метод, который его вызвал
        this.height = height;          //также оно позваляет выводить из "тени" переменные с одинаковым названиями
        this.depth = depth;            //но это не обязательно, можно просто не выбирать одинаковые имена для переменных
    }

    double volume() {
        return width * height * depth;
    }
}

public class boxDemo {
    public static void main(String[] args){
        Box myBox1 = new Box(10,3,14);
        Box myBox2 = new Box(5,3,2);
        System.out.println(myBox1.volume());
        System.out.println(myBox2.volume());
    }
}
