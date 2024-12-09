package org.akash.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.akash.model.Employee;
import org.junit.jupiter.api.Test;

public class FindFirstTest {
    @Test
    void testHighestSalaryEmployee() {
        // Arrange: Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 50000),
            new Employee("Bob", 70000),
            new Employee("Charlie", 60000)
        );
        Optional<Employee> result = FindFirst.secondHighestSalaryEmployee(employees);
        // Assert: Verify the employee with the second-highest salary
        assertTrue(result.isPresent(), "Result should be present");
        assertEquals("Charlie", result.get().getName(), "Employee name should be Charlie");
        assertEquals(60000, result.get().getSalary(), "Salary should be 60000");
    }
}
