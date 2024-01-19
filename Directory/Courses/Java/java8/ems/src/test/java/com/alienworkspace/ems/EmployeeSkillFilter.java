package com.alienworkspace.ems;

import com.alienworkspace.ems.model.Employee;
import com.alienworkspace.ems.model.Skill;

public class EmployeeSkillFilter implements EmployeeFilter{

    Skill employeeSkill;

    public EmployeeSkillFilter(Skill skill) {
        employeeSkill = skill;
    }

    @Override
    public boolean filter(Employee employee) {
        return employee.getSkills().contains(employeeSkill);
    }
}
