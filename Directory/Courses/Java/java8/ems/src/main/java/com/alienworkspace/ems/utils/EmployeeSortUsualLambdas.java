package com.alienworkspace.ems.utils;

import com.alienworkspace.ems.model.Employee;

import java.util.Comparator;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class EmployeeSortUsualLambdas {

//    public static final Comparator<Employee> byNameAlphabetical = ( o1,  o2) -> o1.getName().compareTo(o2.getName());
    // keyExtractor - field that is used to sort objects.

//    public static final Comparator<Employee> byNameAlphabetical =
//        comparing((Employee e) -> e.getName());
    public static final Comparator<Employee> byNameAlphabetical =
        comparing(Employee::getName);

//    public static final Comparator<Employee> byExperience =
//        comparing((Employee e) -> e.getExperience());

//    public static final Comparator<Employee> byExperience =
//            comparing(Employee::getExperience);

    public static final Comparator<Employee> byExperience =
            comparingInt(Employee::getExperience);

//    public static final Comparator<Employee> byInrExpAndName = ( o1,  o2) -> {
//            if (o1.getExperience() == o2.getExperience()){
//                return o1.getName().compareTo(o2.getName());
//            }else {
//                return (o1.getExperience() < o2.getExperience()) ? -1 : 1;
//            }
//
//        };
    // keyExtractor - field that is used to sort objects.
    public static final Comparator<Employee> byInrExpAndName =
        byExperience.thenComparing(byNameAlphabetical);


//    public static final Comparator<Employee> byDecExpAndName = ( o1,  o2) ->  {
//            if (o1.getExperience() == o2.getExperience()){
//                return o1.getName().compareTo(o2.getName());
//            }else {
//                return (o1.getExperience() < o2.getExperience()) ? 1 : -1;
//            }
//    };
    // keyExtractor - field that is used to sort objects.
    public static final Comparator<Employee> byDecExpAndName =
                byExperience
                .reversed()
                .thenComparing(byNameAlphabetical);
}
