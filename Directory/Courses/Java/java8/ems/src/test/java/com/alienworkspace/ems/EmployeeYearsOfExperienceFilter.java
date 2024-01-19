package com.alienworkspace.ems;

import com.alienworkspace.ems.model.Employee;

public class EmployeeYearsOfExperienceFilter implements EmployeeFilter{

    int years;

    public EmployeeYearsOfExperienceFilter(int years) {
        this.years = years;
    }

    @Override
    public boolean filter(Employee employee) {
        return employee.getExperience() > years;
    }
}
