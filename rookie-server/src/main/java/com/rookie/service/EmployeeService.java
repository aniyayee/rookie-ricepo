package com.rookie.service;

import com.rookie.dto.EmployeeLoginDTO;
import com.rookie.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
}
