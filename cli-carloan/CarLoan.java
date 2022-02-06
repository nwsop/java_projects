public class CarLoan {
    /* This is a simple CLI Car loan calculator */
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        // Will divide by 100 later
        int interestRate = 5;
        int downPayment = 2000;

        if(loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid for in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your expected monthly payment is: $" + monthlyPayment);
        }
    }
}