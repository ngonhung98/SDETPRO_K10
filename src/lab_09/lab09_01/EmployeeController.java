package lab_09.lab09_01;

import java.util.List;

public class EmployeeController {

    public int totalSalary(List<Employee> employeeList) {
        int totalSalary=0;
        for (Employee employee : employeeList) {
            totalSalary+= employee.getSalary();
        }
        return totalSalary;
    }
}
