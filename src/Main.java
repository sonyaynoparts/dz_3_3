public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amountOfCredit = 1_000_000;
        double interestRateInPercentages = 9.99;
        int numberOfMonths = 5;
        int monthlyPayment = service.calculate(amountOfCredit, interestRateInPercentages, numberOfMonths);
        System.out.println("Общий вид:");
        System.out.println(monthlyPayment);

        System.out.println("Для первых входных данных:");
        System.out.println(service.calculate(1_000_000, 9.99, 12));

        System.out.println("Для вторых входных данных:");
        System.out.println(service.calculate(1_000_000, 9.99, 24));

        System.out.println("Для третьих входных данных:");
        System.out.println(service.calculate(1_000_000, 9.99, 36));
    }
}
