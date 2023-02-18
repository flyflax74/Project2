package com.example.project2.Controller;

import com.example.project2.Dto.DepartmentDto;
import com.example.project2.Service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DepartmentDtoController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departmentTest")
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody @Valid DepartmentDto departmentDto) {
        ResponseEntity<DepartmentDto> departmentDtoResponseEntity = new ResponseEntity<>(departmentService.getDepartmentDto(departmentDto), HttpStatus.CREATED);
        return departmentDtoResponseEntity;
    }
}
