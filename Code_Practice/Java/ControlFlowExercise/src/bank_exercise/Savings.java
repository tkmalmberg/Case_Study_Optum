package bank_exercise;

public class Savings extends Account {
    private double interestRate = 0.05;
    private double interestTotal, depositTotal;

    public Savings(String branchLocation) {
        super(branchLocation);
        this.balance = 0.00;
        this.interestTotal = 0.00;
        this.depositTotal = 0.00;
    }

    @Override
    public void checkBalance() {
        System.out.printf("The total deposit amount is $%.2f\n", this.depositTotal);
        System.out.printf("The total amount of interest is $%.2f\n", this.interestTotal);
        System.out.println("== Savings Account ==");
        super.checkBalance();
    }

    public void deposit(double amt) {
        double interest = this.balance * this.interestRate;
        this.interestTotal += interest;
        this.balance += interest;
        this.depositTotal += amt;
        this.balance += amt;
        System.out.printf("$%.2f deposited to the savings account.\n", amt);
        System.out.printf("Interest in the amount of $%.2f added to the savings account.\n", interest);
        this.checkBalance();
    }
}
