package com.alienworkspace.ems.workspace.customfunctionalinterface;

public class Main {

    public static void main(String[] args) {
        Course lecturer = new Lecturer();
        Course student = new Student();
        System.out.println("####### Lecturer ###############");
        System.out.println(lecturer.courseName());
        System.out.println("####### Student ###############");
        System.out.println(student.courseName());
    }
}
