public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int sumReple = 1100;
        int total;
        int bonus;
        if (sumReple >= 1000) {
            bonus = sumReple / 100;
            total = balans + sumReple + bonus;
            System.out.println("Количество бонусных рублей = " + bonus + " р " + "Итоговый счет = " + total + " р ");
        } else {
            bonus = 0;
            total = balans + sumReple + bonus;
            System.out.println("Количество бонусных рублей = " + bonus + " р " + "Итоговый счет = " + total + " р ");
        }
    }
}