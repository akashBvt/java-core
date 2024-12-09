package org.akash.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.akash.model.Employee;
import org.junit.jupiter.api.Test;

public class FindFirstTest {

    @Test
    void testSecondHighestSalaryEmployee() throws Exception {
        // Arrange: Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 50000),
            new Employee("Bob", 70000),
            new Employee("Charlie", 60000)
        );

        // Act: Call the method
        Employee result = FindFirst.secondHighestSalaryEmployee(employees);

        // Assert: Verify the employee with the second-highest salary
        assertEquals("Charlie", result.getName(), "Employee name should be Charlie");
        assertEquals(60000, result.getSalary(), "Salary should be 60000");
    }

    @Test
    void testSecondHighestSalaryEmployeeWithEmptyList() {
        // Arrange: Create an empty list of employees
        List<Employee> employees = Arrays.asList();

        // Act & Assert: Expect an exception due to no employees
        Exception exception = assertThrows(Exception.class, () -> FindFirst.secondHighestSalaryEmployee(employees));
        assertEquals("Does not exsist", exception.getMessage(), "Exception message should indicate non-existence");
    }
}
