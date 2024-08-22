package com.Employee.EmpManagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

   
    EmployeeRepository employeeRepository;

    @Override
    public String CreateEmp(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties (employee,employeeEntity);
        employeeRepository.save(employeeEntity);
        // employees.add(employee);
        return "added successfully";
    }

    @Override
    public List<Employee> ReadEmp() {
        
        List<EmployeeEntity>employeesList = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();

        for (EmployeeEntity employeeEntity : employeesList) {
            // employees.add(employeeEntity);
            Employee e = new Employee();
            e.setName(employeeEntity.getName());
            e.setEmail(employeeEntity.getEmail());
            e.setPhone(employeeEntity.getPhone());
            employees.add(e);
        }
        return employees;
    }

   

    @Override
   public boolean DeleteEmp(Long id) {
    // for (Employee employee : employees) {
    //     if (employee.getId().equals(id)) {
    //         employees.remove(employee);
    //         return true;
    //     }
    // }
    return false; 
  }


}
