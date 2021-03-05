package bank_exercise;

public class BankDriver {
    public static void main(String[] args) {
        Checking acc1 = new Checking("MPLS");

        System.out.println(Bank.getBankName());
        acc1.checkLocation();
        acc1.deposit(100.00);
        acc1.deposit(200.00);
        acc1.withdraw(250.00);
        acc1.deposit(300.00);
        acc1.withdraw(400.00);
        acc1.checkBalance();
        System.out.println("---------------------------------------------------");

        Savings acc2 = new Savings("MPLS");

    }
}
