package staff;

public abstract class Employee {
    private String name;
    private String NI;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNI() {
        return NI;
    }

    public void setNI(String NI) {
        this.NI = NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise) {
        this.salary += raise;
    }

    public double payBonus() {
        return salary = 0.01;
    }
}
