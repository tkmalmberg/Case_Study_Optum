package employee;

public class Employee {
    protected long empId;
    protected String empName, empAddress;
    protected int empPhone;
    protected double basicSalary, specialAllowance, hra;

    public Employee(long empId, String empName, String empAddress, int empPhone, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empPhone = empPhone;
        this.basicSalary = basicSalary;
        this.specialAllowance = 250.80;
        this.hra = 1000.50;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public int getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(int empPhone) {
        this.empPhone = empPhone;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSpecialAllowance() {
        return specialAllowance;
    }

    public void setSpecialAllowance(double specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    protected double calculateSalary() {
        double salary;
        salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
        System.out.println(salary);
        return salary;
    }

    protected double calculateTransportAllowance() {
        double transportAllowance;
        transportAllowance = 10/100.0*basicSalary;
        System.out.println(transportAllowance);
        return transportAllowance;
    }
}
