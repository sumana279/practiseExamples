package com.example.JavaAlg.ThreadSafeQueue;

import java.util.Comparator;

/**
 * Created by svishnu on 8/3/17.
 */
public class Employee implements Comparable<Employee> {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee e1) {
        if (salary - e1.salary > 0) {
            return 1;
        } else if (salary - e1.salary < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
