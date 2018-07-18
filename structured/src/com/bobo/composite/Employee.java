package com.bobo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evildoerDb on 2018/7/18 17:40
 *
 * 员工类
 */
public class Employee {

    private String name;

    private String dept;

    private int salary;

    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add (Employee employee){

        subordinates.add(employee);
    }

    public void remove(Employee employee){
          subordinates.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary ;
    }
}
