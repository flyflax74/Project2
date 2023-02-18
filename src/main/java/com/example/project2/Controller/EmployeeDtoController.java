package com.example.project2.Controller;

import com.example.project2.Dto.EmployeeDto;
import com.example.project2.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmployeeDtoController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employeeTest")
    public ResponseEntity<EmployeeDto> createEmployee (@RequestBody @Valid EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeService.getEmployeeDto(employeeDto), HttpStatus.CREATED);
    }
}
