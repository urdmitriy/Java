import my.Calculate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        while (true) {
            System.out.println("Введите год: ");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней: ");
            int days = scanner.nextInt();

            if (Calculate.checkYear(year, days)) {
                points++;
            } else {
                System.out.println("Неправильно! В этом году 365 дней!");
                System.out.println("Набрано очков: " + points);
                break;
            }
        }
    }
}