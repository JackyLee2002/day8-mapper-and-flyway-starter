package com.oocl.springbootemployee.mapper;

import com.oocl.springbootemployee.dto.EmployeeResponse;
import com.oocl.springbootemployee.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeMapper {
    public List<EmployeeResponse> toResponses(List<Employee> employeeList) {
        return employeeList.stream()
                .map(employee -> {
                    EmployeeResponse employeeResponse = new EmployeeResponse();
                    employeeResponse.setAge(employee.getAge());
                    employeeResponse.setName(employee.getName());
                    employeeResponse.setGender(employee.getGender());
                    return employeeResponse;
                })
                .toList();
    }

    public EmployeeResponse toResponse(Employee employee) {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setAge(employee.getAge());
        employeeResponse.setName(employee.getName());
        employeeResponse.setGender(employee.getGender());
        return employeeResponse;
    }
}
