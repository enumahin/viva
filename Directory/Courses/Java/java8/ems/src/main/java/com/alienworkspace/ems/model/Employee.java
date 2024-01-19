package com.alienworkspace.ems.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String name;

    private int experience;

    private Designation designation;

    private Unit unit;

    private List<Skill> skills;

    @Override
    public String toString() {
        return "\n" +
                name + " with "+ getSkills().size() +" number(s) of skills and " + experience + " years of experience";
    }
}
