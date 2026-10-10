package SOLIDPrinciples.SRP;

/*this code violates SRP, as the class holds the employee data and also calculates salary
and generates report which is not an employee work.

This class violates SRP: This class has multiple responsibilities.*/

class Employee2 {
    private String empName;
    private double salary;

    public Employee2(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    public Double calculateSalary() {
        return salary * 1.2;
    }

    public void generateReport(){
        System.out.println("Report generated....");
    }
}

public class SRPViolation{
    static void main() {
        Employee2 employee = new Employee2("Sam", 5000);
        System.out.println("Salary: "+ employee.calculateSalary());
    }
}
