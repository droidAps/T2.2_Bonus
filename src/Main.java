public class Main {
    public static void main(String[] args) {
        int balance = 300;                           // текущий баланс счета клиента
        int refill = 1756;                           // сумма пополнения счета
        int bonus;                                   // количество бонусных рублей
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int total = balance + refill + bonus;        // итоговый баланс счета клиента (включает пополнение и бонусы)
        System.out.println(bonus);
        System.out.println(total);
    }
}

