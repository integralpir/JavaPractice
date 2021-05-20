/*
Смысл программы в демонстрации перегружаемости класса
Что немного развязывает руки пользователю и предупреждает ошибки
И вообще является довольно крутой фичей, не помню, чтобы в питон можно было запихивать
несколько конструкторов
 */


class overBox {
    double height, width, depth;

    overBox(double h, double w, double d){ // конструктор класса когда указаны все элементы
        height = h;
        width = w;
        depth = d;
    }

    overBox(){             // конструктор класса, когда не указывается ни один элемент, с определенными стандартными значениями
        height = -1;
        width = -1;
        depth = -1;
    }

    overBox(double len){   // конструктор класса, когда нам нужен куб
        height = width = depth = len;
    }

    double getPer() {
        return height + width + depth;
    }

    double getVar(){
        return height * width * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args){
        overBox myBox1 = new overBox(10, 20, 15);
        overBox myBox2 = new overBox();
        overBox myBox3 = new overBox(10);

        System.out.println(myBox1.getPer());
        System.out.println(myBox1.getVar());
        System.out.println(myBox2.getPer());
        System.out.println(myBox2.getVar());
        System.out.println(myBox3.getPer());
        System.out.println(myBox3.getVar());
    }
}
