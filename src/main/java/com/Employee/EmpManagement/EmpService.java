package com.Employee.EmpManagement;

import java.util.List;

public interface EmpService {
    String CreateEmp(Employee employee);
    List<Employee> ReadEmp();
    boolean DeleteEmp(Long id);
    
}
