package solid.ocp.invalid;

public class Employee {
    private final EmployeeType empType;

    public Employee(EmployeeType empType) {
        this.empType = empType;
    }

    public EmployeeType getEmpType() {
        return empType;
    }
}
