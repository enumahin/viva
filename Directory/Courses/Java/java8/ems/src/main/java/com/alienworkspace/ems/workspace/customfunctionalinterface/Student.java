package com.alienworkspace.ems.workspace.customfunctionalinterface;

public class Student implements Course{
    @Override
    public String courseName() {
        return "I am studying Math";
    }
}
