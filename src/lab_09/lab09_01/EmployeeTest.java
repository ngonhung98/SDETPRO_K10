package lab_09.lab09_01;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee A = new Contractor();
        Employee B = new FTE();
        List<Employee> employeeList= Arrays.asList(A,B);

        int totalSalary= new EmployeeController().totalSalary(employeeList);
        System.out.println(totalSalary);
    }
}
