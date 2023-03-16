package solid.ocp.invalid;

import java.util.List;

public class HRManager {

    public void increasePayAll(List<Employee> employees) {
        for(Employee employee : employees) {
            if(employee.getEmpType() == EmployeeType.FACULTY) {
                increasePayFaculty((Faculty) employee);
            } else if (employee.getEmpType() == EmployeeType.STAFF) {
                increasePayStaff((Staff) employee);
            } else if (employee.getEmpType() == EmployeeType.SECRETARY) {
                increasePaySecertary((Secretary) employee);
            }
        }
    }

    public void increasePayFaculty(Faculty faculty) {
        // omitted
    }

    public void increasePayStaff(Staff staff) {
        // omitted
    }

    public void increasePaySecertary(Secretary secretary) {
        // omitted
    }
}
