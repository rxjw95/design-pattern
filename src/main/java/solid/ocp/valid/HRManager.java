package solid.ocp.valid;


import java.util.List;

public class HRManager {

    public void increasePayAll(List<Employee> employees) {
        employees.forEach(Employee::increaseSalary);
    }
}

