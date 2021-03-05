package bank_exercise;

public class Bank {
    private static String bankName = "Bank of America";
    private String branchLocation;

    public Bank(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public static void changeBank(String n) {
        bankName = n;
        System.out.println("The bank is now " + bankName);
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        Bank.bankName = bankName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public void checkLocation() {
        System.out.println("The current branch location is " + this.branchLocation);
    }

    public void changeLocation(String loc) {
        System.out.println("The branch location is changed from " + this.branchLocation + " to " + loc);
        this.branchLocation = loc;
    }

    public void checkBalance() {
        System.out.println("You need to create an account to check the balance.");
    }
}
