package org.akash.streams;

import org.akash.comparator.Comparator;
import org.akash.model.Employee;

import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static Optional<Employee> secondHighestSalaryEmployee(List<Employee> employees){
        return employees.stream().sorted(Comparator.EmployeeSalaryComparator()).skip(1).findFirst();
    }
    
}
