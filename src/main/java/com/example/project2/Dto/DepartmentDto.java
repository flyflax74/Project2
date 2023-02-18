package com.example.project2.Dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;
@Data   @NoArgsConstructor  @AllArgsConstructor
@Getter @Setter
public class DepartmentDto {
    private String departmentId;
    @NotBlank(message = "please input name of department")
    @Size(min = 10, max = 50)
    private String deptName;
    @NotNull(message = "you need to describe something")
    private String description;
    @Valid
    private List<EmployeeDto> employeeDtoList;
}
