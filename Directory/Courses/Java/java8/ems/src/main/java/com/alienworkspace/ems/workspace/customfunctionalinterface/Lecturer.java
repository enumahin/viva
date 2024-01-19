package com.alienworkspace.ems.workspace.customfunctionalinterface;

public class Lecturer implements Course{
    @Override
    public String courseName() {
        return "I teach Math";
    }
}
