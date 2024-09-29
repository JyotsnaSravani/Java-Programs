import java.util.Scanner;
class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;
    SavingsAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial balance: ");
        savingsBalance = sc.nextDouble();
    }
    void calculateMonthlyInterest() {
        double interest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += interest; 
        System.out.println("Monthly Interest: " + interest);
        System.out.println("New Balance: " + savingsBalance);
    }
    static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate; // Set the new interest rate
        System.out.println("Annual Interest Rate updated to: " + annualInterestRate);
    }

    public static void main(String[] args) {
        modifyInterestRate(0.09);
        SavingsAccount account = new SavingsAccount();
        account.calculateMonthlyInterest(); 
        }
    
}