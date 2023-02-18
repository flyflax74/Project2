package com.example.project2.Service.Impl;

import com.example.project2.Dto.DepartmentDto;
import com.example.project2.Service.DepartmentService;
import com.example.project2.Service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto) {
        LOGGER.info(departmentDto.toString());
        return departmentDto;
    }
}
