package com.example.project2.Service.Impl;

import com.example.project2.Dto.EmployeeDto;
import com.example.project2.Service.DepartmentService;
import com.example.project2.Service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) {
        LOGGER.info(employeeDto.toString());
        return employeeDto;
    }
}
