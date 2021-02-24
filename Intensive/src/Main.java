public class Main {
    public static void main (String[] args) {
        System.out.println("Кофе - машина");

        coffeeMachine machine = new coffeeMachine(120, 100, 90);
        coffeeMachine machine2 = new coffeeMachine(100, 90, 50);
        int money = 12;
        machine.checkPrice(money);
        machine2.checkPrice(money);
    }
}
