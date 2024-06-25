public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amountOfCredit = 1_000_000;
        double interestRateInPercentages = 9.99;
        int numberOfMonths = 36;
        int monthlyPayment = service.calculate(amountOfCredit, interestRateInPercentages, numberOfMonths);
        System.out.println(monthlyPayment);
    }
}
