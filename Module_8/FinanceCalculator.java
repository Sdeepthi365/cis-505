package Module_8;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class FinanceCalculator { // Class name is FinanceCalculator. 
    private static int MONTHS_IN_YEAR = 12; // Constant for the number of months in a year. 
    static double calculateFutureValue(double monthlyPayment, double rate, int years) //  Method to calculate future value. 
    {
        int months = years * MONTHS_IN_YEAR;
        int interestRate = (int) rate + 1 / 100;
        double presentValue = monthlyPayment * months;
        double futureValue = presentValue * Math.pow(interestRate, months);
        return futureValue;   
    }
    
}
