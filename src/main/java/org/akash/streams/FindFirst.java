package org.akash.streams;

import java.util.List;

import org.akash.comparator.Comparator;
import org.akash.model.Employee;

public class FindFirst {
    public static Employee secondHighestSalaryEmployee(List<Employee> employees) throws Exception{
        return employees.stream().sorted(Comparator.EmployeeSalaryComparator()).skip(1).findFirst().orElseThrow(()-> new Exception("Does not exsist"));
    }
    
}
