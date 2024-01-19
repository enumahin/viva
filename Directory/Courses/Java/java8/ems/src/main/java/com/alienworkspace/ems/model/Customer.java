package com.alienworkspace.ems.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String firstName;

    private String lastName;

    private String email;

    private int age;

}