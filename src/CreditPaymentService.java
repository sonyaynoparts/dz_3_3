public class CreditPaymentService {
    public int calculate(double amountOfCredit, double interestRateInPercentages, int numberOfMonths) {
        double x = Math.pow((1 + interestRateInPercentages / 100 / 12), numberOfMonths); //Вводим переменную х
        double annuityCoefficient = (interestRateInPercentages / 100 / 12 * x) / (x - 1);
        int monthlyPayment = (int) (amountOfCredit * annuityCoefficient);
        return monthlyPayment;
    }
}

