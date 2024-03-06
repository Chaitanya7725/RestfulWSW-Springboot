package com.chaitanya.springbootdemo.error;


import com.chaitanya.springbootdemo.model.Employee;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String message){
        super(message);
    }


}
