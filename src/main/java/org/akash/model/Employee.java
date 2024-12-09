package org.akash.model;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Employee{
    private String Name;
    private double salary;
    
    public Employee(String name, double salary) {
        Name = name;
        this.salary = salary;
        System.out.println("employe Object created");
    }

    static{
        System.out.println("hello from static block of employee");
    }

}