package com.alienworkspace.ems.service;

import com.alienworkspace.ems.model.Employee;
import com.alienworkspace.ems.utils.EmployeeSortUsual;
import com.alienworkspace.ems.utils.EmployeeSortUsualLambdas;
import com.alienworkspace.ems.utils.EmployeeUtil;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@NoArgsConstructor
public class EmployeeService {

    public List<Employee> getEmployeesFilteredBy(Predicate<Employee> filter) {
//        List<Employee> employees = EmployeeUtil.initialize();
//
//        List<Employee> filteredEmployee = new ArrayList<>();
//        for (Employee employee : employees) {
//            if(filter.test(employee)) {
//                filteredEmployee.add(employee);
//            }
//        }
//        return filteredEmployee;

        return EmployeeUtil.initialize().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    public List<Employee> getEmployeesWithMoreThan1SkillSortByExperience() {

        return EmployeeUtil.initialize().stream()
                .filter(e -> null != e.getSkills() && e.getSkills().size() > 1)
                .sorted(Comparator.comparingInt(Employee::getExperience))
                .collect(Collectors.toList());
    }

    public List<Employee> sortByName() {
        List<Employee> employees = EmployeeUtil.initialize();
//        Collections.sort(employees, EmployeeSortUsual.byNameAlphabetical);
//        Collections.sort(employees, EmployeeSortUsualLambdas.byNameAlphabetical);
        employees.sort(EmployeeSortUsualLambdas.byNameAlphabetical);
        return employees;
    }

    public List<Employee> sortByIncreasingExpAndTheName(){
        List<Employee> employees = EmployeeUtil.initialize();
//        Collections.sort(employees, EmployeeSortUsual.byInrExpAndName);
        employees.sort(EmployeeSortUsualLambdas.byInrExpAndName);
        return employees;
    }

    public List<Employee> sortByDecreasingExpAndTheName(){
        List<Employee> employees = EmployeeUtil.initialize();
//        Collections.sort(employees, EmployeeSortUsual.byDecExpAndName);
        employees.sort(EmployeeSortUsualLambdas.byDecExpAndName);
        return employees;
    }
}
