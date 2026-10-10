package SOLIDPrinciples.SRP;

class Employee {
    private String empName;
    private double salary;

    public Employee(String empName, double salary)
    {
        this.empName = empName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}

class SalaryCalculator {
    private Employee emp;

    public SalaryCalculator(Employee emp)
    {
        this.emp = emp;
    }

    public Double calculateSalary(){
        return emp.getSalary() * 1.2;
    }
}

class ReportGenerator {
    private Employee2 emp;
    public ReportGenerator(Employee2 emp)
    {
        this.emp = emp;
    }

    public void generateReport()
    {
        System.out.println("Report generated.....");
    }
}

public class SRPWithoutViolation{
    static void main() {
        Employee emp1 = new Employee("Emp1", 5000);
        SalaryCalculator calculator = new SalaryCalculator(emp1);
        System.out.println(calculator.calculateSalary());
    }
}
