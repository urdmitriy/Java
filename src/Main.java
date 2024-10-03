import my.Calculate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

            String res = scanner.next();
            if (res.equals("end")) {
                break;
            }
            int selectValue = Integer.parseInt(res);
            switch (selectValue) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    Calculate.incomeAdd(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    Calculate.consumptionAdd(scanner.nextInt());
                    break;
                case 3:
                    Calculate.taxSystemGet();
                    break;
                default:
                    break;
            }
        }
    }
}