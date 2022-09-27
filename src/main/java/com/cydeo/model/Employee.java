package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    //3 - @NotNull   //--> field cannot be null
    //2 - @NotEmpty  //--> field cannot be empty ""
    //1 - @NotBlank  //--> field cannot be blank "    "

    @NotBlank
    @Size(max=12, min=2)
    private String firstName;
    private String lastName;

    //Thymeleaf returns yyyy-mm-dd (LocalDate returns mm-dd-yyyy)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
