package employee;

public class Manager extends Employee{
    public Manager(long empId, String empName, String empAddress, int empPhone, double basicSalary) {
        super(empId, empName, empAddress, empPhone, basicSalary);
    }

    @Override
    protected double calculateTransportAllowance() {
        double transportAllowance;
        transportAllowance = 15/100.0*basicSalary;
        System.out.println(transportAllowance);
        return transportAllowance;
    }
}
