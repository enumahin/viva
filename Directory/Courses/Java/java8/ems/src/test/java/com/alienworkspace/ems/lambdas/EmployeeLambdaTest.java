package com.alienworkspace.ems.lambdas;

import com.alienworkspace.ems.model.Designation;
import com.alienworkspace.ems.model.Employee;
import com.alienworkspace.ems.model.Skill;
import com.alienworkspace.ems.model.Unit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeLambdaTest {

    private static final List<Employee> employees = new ArrayList<>();

    public static void main(String arg[]) {
        initialize();

        // 1. Get me list of all employees in Extended Development Center.
        System.out.println("--------All in EDC-------");

        List<Employee> allInEdc = getAllEmployeeFilterBy(employee -> employee.getUnit().equals(Unit.EDC));

        System.out.println(allInEdc);

        // 2. Get me list of all employees in Financial Services.
        System.out.println("------All in FS------");

        List<Employee> allInFS = getAllEmployeeFilterBy(employee -> employee.getUnit().equals(Unit.FS));


        System.out.println(allInFS);

        // 3. Get all employees with java skills.
        System.out.println("--------All java developers-------");

        List<Employee> allJavaDevelopers = getAllEmployeeFilterBy(employee -> employee.getSkills().contains(Skill.JAVA));
        System.out.println(allJavaDevelopers);

        // 4. Get all employees with years of experience.
        System.out.println("--------All developers with years of experience-------");

        List<Employee> allDevelopersWithYearsOfExperience = getAllEmployeeFilterBy(employee ->employee.getExperience() > 10);
        System.out.println(allDevelopersWithYearsOfExperience);
    }

    private static List<Employee> getAllEmployeeFilterBy(EmployeeLambdaFilter employeeFilter) {
        List<Employee> allEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employeeFilter.filter(employee)){
                allEmployees.add(employee);
            }
        }
        return allEmployees;
    }

    private static void initialize() {
        List<Skill> dev1Skills = new ArrayList<>();
        dev1Skills.add(Skill.JAVA);
        dev1Skills.add(Skill.JPA);

        // Amit is a developer with Java, Jpa
        employees.add(new Employee("Amit", 8, Designation.DEVELOPER, Unit.EDC, dev1Skills));

        // Rahul with .NET as a programmer
        List<Skill> dev2Skills = new ArrayList<>();
        dev2Skills.add(Skill.MICROSOFT);
        employees.add(new Employee("Rahul", 5, Designation.DEVELOPER, Unit.EDC, dev2Skills));

        // Peter with python as a programmer
        List<Skill> dev3Skills = new ArrayList<>();
        dev3Skills.add(Skill.PYTHON);
        employees.add(new Employee("Peter", 7, Designation.DEVELOPER, Unit.FS, dev3Skills));

        // Stanley with angular/js as a programmer in oil and gas
        List<Skill> dev4Skills = new ArrayList<>();
        dev4Skills.add(Skill.ANGULARJS);
        employees.add(new Employee("Stanley", 3, Designation.DEVELOPER, Unit.OIL_GAS, dev4Skills));

        // Manoj with java and angular as a programmer in FS
        List<Skill> dev5Skills = new ArrayList<>();
        dev5Skills.add(Skill.JAVA);
        dev5Skills.add(Skill.ANGULARJS);
        employees.add(new Employee("Manoj", 3, Designation.DEVELOPER, Unit.FS, dev5Skills));

        // Jose as manager
        List<Skill> managerSkills = new ArrayList<>();
        managerSkills.add(Skill.PMP);
        employees.add(new Employee("Jose", 15, Designation.MANAGER, Unit.EDC, managerSkills));

        // Pirlo as architect in edc.
        List<Skill> architectSkills = new ArrayList<>();
        architectSkills.add(Skill.DESIGN);
        employees.add(new Employee("Pirlo", 13, Designation.ARCHITECT, Unit.EDC, architectSkills));

    }
}
