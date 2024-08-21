package com.Employee.EmpManagement;

// import java.util.ArrayList;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    
    EmpService empService = new EmpServiceImpl();


    //Dependency Injection
    
    //EmpService empService;
    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return empService.ReadEmp();
    }

    @PostMapping("employees")
    public String AddEmp(@RequestBody Employee employee){
        return empService.CreateEmp(employee);    
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmp(@PathVariable Long id){
        if(empService.DeleteEmp(id))
            return "Deleted Successfully";
        return "Not Found"; 
    }
}
