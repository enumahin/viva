package com.alienworkspace.ems;

import com.alienworkspace.ems.model.Employee;
import com.alienworkspace.ems.model.Unit;

public class EmployeeUnitFilter implements EmployeeFilter{

    Unit employeeUnit;

    public EmployeeUnitFilter(Unit employeeUnit) {
        this.employeeUnit = employeeUnit;
    }

    @Override
    public boolean filter(Employee employee) {
        return employee.getUnit() == employeeUnit;
    }
}
