package com.alienworkspace.ems.utils;

import com.alienworkspace.ems.model.Designation;
import com.alienworkspace.ems.model.Employee;
import com.alienworkspace.ems.model.Skill;
import com.alienworkspace.ems.model.Unit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {

    public static List<Employee> initialize(){
        List<Employee> employees = new ArrayList<>();

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

            // Jose with java and angular as a programmer in FS
            List<Skill> managerSkills = new ArrayList<>();
            managerSkills.add(Skill.PMP);
            employees.add(new Employee("Jose", 15, Designation.MANAGER, Unit.EDC, managerSkills));

            // Pirlo with java and angular as a programmer in FS
            List<Skill> architectSkills = new ArrayList<>();
            architectSkills.add(Skill.DESIGN);
            employees.add(new Employee("Pirlo", 13, Designation.ARCHITECT, Unit.EDC, architectSkills));
            return employees;
        }
}
