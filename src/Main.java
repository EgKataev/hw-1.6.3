public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int part = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += part;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        //Задание 2
        System.out.println("Задание 2");
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");
        }
    }
}