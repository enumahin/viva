package com.alienworkspace.ems;

import com.alienworkspace.ems.model.Employee;
import com.alienworkspace.ems.service.EmployeeService;
import com.alienworkspace.ems.utils.EmployeeUtil;

import java.util.List;

public class EmployeeComparatorTest {

    private static final EmployeeService employeeService = new EmployeeService();

    public static void main(String[] args) {

        // Sort all employees alphabetically
        testSortByName();

        // Sort with increasing experience and if same experience, then alphabetically
        testSortByIncreasingExperienceAndThenName();

        // Sort with decreasing experience and if same alphabetically
        testSortByDecreasingExperienceAndThenName();

        // Sort with decreasing experience and if same alphabetically
        testFilterSkillsMoreThan1AndSortByExperienceLevel();
    }

    private static void testFilterSkillsMoreThan1AndSortByExperienceLevel() {
        System.out.println("Filter By Number of Skills and sort by Experience Level");
        System.out.println(employeeService.getEmployeesWithMoreThan1SkillSortByExperience());
    }

    private static void testSortByDecreasingExperienceAndThenName() {
        List<Employee> employees = employeeService.sortByDecreasingExpAndTheName();
        System.out.println(employees);
    }

    private static void testSortByIncreasingExperienceAndThenName() {
        List<Employee> employees = employeeService.sortByIncreasingExpAndTheName();
        System.out.println(employees);
    }

    private static void testSortByName() {
        List<Employee> employees = employeeService.sortByName();
        System.out.println(employees);
    }
}
