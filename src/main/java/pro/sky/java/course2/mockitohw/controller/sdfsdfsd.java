package pro.sky.java.course2.mockitohw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.java.course2.mockitohw.model.Employee;
import pro.sky.java.course2.mockitohw.service.EmployeesService;

import java.util.List;

public class EmployeesController {
    private static EmployeesService employeesService;
    public EmployeesController(EmployeesService employeesService) {
        EmployeesController.employeesService = employeesService;
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("lastName") String lastName,
                                 @RequestParam("firstName") String firstName,
                                 String departmentId, int salaryOfEmployee){
        Employee employee = new Employee(lastName, firstName, departmentId, salaryOfEmployee);
        return employeesService.addEmployee(employee);
    }
    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("lastName") String lastName,
                                    @RequestParam("firstName") String firstName,
                                    String departmentId, int salaryOfEmployee){
        Employee employee = new Employee(lastName, firstName, departmentId, salaryOfEmployee);
        return employeesService.removeEmployee(employee);

    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("lastName") String lastName,
                                  @RequestParam("firstName") String firstName,
                                  String departmentId, int salaryOfEmployee){
        Employee employee = new Employee(lastName, firstName, departmentId, salaryOfEmployee);
        return employeesService.findEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeesService.getAll();
    }
}


