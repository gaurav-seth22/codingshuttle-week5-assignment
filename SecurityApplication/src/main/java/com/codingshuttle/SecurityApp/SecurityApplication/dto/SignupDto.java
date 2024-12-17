package com.codingshuttle.SecurityApp.SecurityApplication.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class SignupDto {

    String email;
    String password;
    String name;


}
