package org.akash.comparator;


import org.akash.model.Employee;

public class Comparator {
    public static java.util.Comparator<Employee> EmployeeSalaryComparator(){
        java.util.Comparator<Employee> comparator = (e1,e2)->Double.compare(e2.getSalary(), e1.getSalary());
        return comparator;
    }
}
