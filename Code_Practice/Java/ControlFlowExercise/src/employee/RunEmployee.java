package employee;

public class RunEmployee {
    public static void main(String[] args) {
        Employee man = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        Employee tra = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);

        man.calculateSalary();
        tra.calculateSalary();

        man.calculateTransportAllowance();
        tra.calculateTransportAllowance();

    }
}
