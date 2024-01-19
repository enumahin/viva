package com.alienworkspace.ems.utils;

import com.alienworkspace.ems.model.Employee;

import java.util.Comparator;

public class EmployeeSortUsual {

    public static final Comparator<Employee> byNameAlphabetical = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static final Comparator<Employee> byInrExpAndName = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getExperience() == o2.getExperience()){
                return o1.getName().compareTo(o2.getName());
            }else {
                return (o1.getExperience() < o2.getExperience()) ? -1 : 1;
            }

        }
    };

    public static final Comparator<Employee> byDecExpAndName = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getExperience() == o2.getExperience()){
                return o1.getName().compareTo(o2.getName());
            }else {
                return (o1.getExperience() < o2.getExperience()) ? 1 : -1;
            }

        }
    };
}
