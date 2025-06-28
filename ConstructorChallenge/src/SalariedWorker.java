public class SalariedWorker extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedWorker(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        isRetired = true;

    }

}


