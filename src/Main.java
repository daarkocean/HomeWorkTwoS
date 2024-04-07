public class Main {
    public static void main(String[] args) {
        int checkF = 100; // первоначальная сумма на счету клиента
        int replenishment = 3000; // сумма пополнения денежных средств

        int x;

        if (replenishment > 1000) {
            x = replenishment / 100; // подсчет бонусов
        } else {
            x = 0;
        }
        int sum = checkF + replenishment + x;
        System.out.println("Ваш итоговый счет: " + sum);
        System.out.println("В том числе бонусов: " + x);
    }
}