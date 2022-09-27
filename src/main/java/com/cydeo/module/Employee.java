package com.cydeo.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String firstName;
    private String lastName;
    //Thymeleaf returns yyyy-mm-dd,but LocalDate mm-dd-yyyy
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;



}
