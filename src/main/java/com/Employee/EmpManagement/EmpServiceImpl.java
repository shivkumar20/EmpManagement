package com.Employee.EmpManagement;

import java.util.ArrayList;
import java.util.List;

public class EmpServiceImpl implements EmpService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public String CreateEmp(Employee employee) {
        employees.add(employee);
        return "added successfully";
    }

    @Override
    public List<Employee> ReadEmp() {
        return employees;
    }

    // @Override
    // public boolean DeleteEmp(Long id) {
    //    employees.remove(id);
    //    return true;
    // }

    @Override
   public boolean DeleteEmp(Long id) {
    for (Employee employee : employees) {
        if (employee.getId().equals(id)) {
            employees.remove(employee);
            return true;
        }
    }
    return false; 
  }


}
