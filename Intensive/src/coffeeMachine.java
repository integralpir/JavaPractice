public class coffeeMachine {

    private int lattePrice;
    private int cappucinoPrice;
    private int teaPrice;

    public coffeeMachine(int lattePrice, int cappucinoPrice, int teaPrice){
        this.lattePrice = lattePrice;
        this.cappucinoPrice = cappucinoPrice;
        this.teaPrice = teaPrice;
    }

    public void checkPrice(int moneyAmount){
        System.out.println("Вы внесли " + moneyAmount + " руб.");


        boolean canBuySomething = false;

        if (moneyAmount >= lattePrice) {
            System.out.println("Вы можете купить латте");
            canBuySomething = true;
        }

        if (moneyAmount >= cappucinoPrice) {
            System.out.println("Вы можете купить капучино");
            canBuySomething = true;
        }

        if (moneyAmount >= teaPrice) {
            System.out.println("Вы можете купить чай");
            canBuySomething = true;
        }

        if (canBuySomething == false) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
        }
    }
}