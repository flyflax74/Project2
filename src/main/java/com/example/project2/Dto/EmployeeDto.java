package com.example.project2.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data   @AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class EmployeeDto {
    private String employeeId;
    @NotBlank(message = "Please input your name")
    @Size(min = 10, max = 50, message = "Lengths from 10 to 50 characters")
    private String name;
    @NotNull(message = "Let me know your birthday")
    private String birthDay;
    private String gender;
    @NotBlank(message = "Email is required")
    @Email
    private String email;
}
