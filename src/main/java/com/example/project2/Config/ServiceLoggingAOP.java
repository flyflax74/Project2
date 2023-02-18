package com.example.project2.Config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@Aspect
public class ServiceLoggingAOP {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ServiceLoggingAOP.class);

    @Before("execution(* com.example.project2.Service.DepartmentService.getDepartmentDto(..))")
    public void beforeGetDepartmentDto(JoinPoint joinPoint){
        LOGGER.info("Before called " + joinPoint.toString());
    }
    @After("execution(* com.example.project2.Service.DepartmentService.getDepartmentDto(..))")
    public void afterGetDepartmentDto(JoinPoint joinPoint) {
        LOGGER.info("After called" + joinPoint.toString());
    }

    @AfterThrowing("execution(* com.example.project2.Service.DepartmentService.getEmployeeDto")
    public void afterFailGetEmployeeDto(JoinPoint joinPoint) {
        LOGGER.info("After fail called" + joinPoint.toString());
    }
}
