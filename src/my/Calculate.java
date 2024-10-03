package my;

public class Calculate {
    public static int income = 0;
    public static int consumption = 0;
    public static final int TAX_INCOME = 6;
    public static final int TAX_INCOME_CONSUMPTION = 15;

    public static void incomeAdd (int incomeValue) {
        income += incomeValue;
    }
    public static void consumptionAdd (int consumptionValue) {
        consumption += consumptionValue;
    }

    public static void taxSystemGet() {
        int taxIncome = income * TAX_INCOME / 100;
        int taxIncomeConsumption = (income - consumption) * TAX_INCOME_CONSUMPTION / 100;
        if (taxIncome < taxIncomeConsumption){
            System.out.println("Мы советуем вам УСН доходы");
            System.out.println("Ваш налог составит: " + taxIncome + " рублей");
            System.out.println("Налог на другой системе: " + taxIncomeConsumption + " рублей");

        } else {
            System.out.println("Мы советуем вам УСН доходы - расходы");
            System.out.println("Ваш налог составит: " + taxIncomeConsumption + " рублей");
            System.out.println("Налог на другой системе: " + taxIncome + " рублей");
        }
        System.out.println("Экономия: " + Math.abs(taxIncome - taxIncomeConsumption) + " рублей");
    }
}
