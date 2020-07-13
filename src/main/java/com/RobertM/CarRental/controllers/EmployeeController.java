package com.RobertM.CarRental.controllers;


import com.RobertM.CarRental.model.dto.EmployeeDto;
import com.RobertM.CarRental.repositories.EmployeeRepository;
import com.RobertM.CarRental.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployeeController {


    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        model.addAttribute("employeesList", employees);
        return "employees";
    }
    @GetMapping("/employeesEditor")
    public String getAllEmployeesAdmin(Model model) {
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        model.addAttribute("employeesList", employees);
        return "employeesEditor";
    }

    @GetMapping("/addEmployee")
    public String addEmployeeForm() {
        return "addEmployee";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(EmployeeDto employeeDto) {
        employeeService.saveEmployee(employeeDto);
        return "redirect:/employeesEditor";
    }

    @GetMapping("/editEmployee")
    public String editEmployee(Model model,
                           @RequestParam("id") Long id) {
        EmployeeDto employeeDto = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employeeDto);
        return "editEmployee";
    }

    @PostMapping("/editEmployee")
    public String saveEditedEmployee(EmployeeDto employeeDto) {
        employeeService.saveEmployee(employeeDto);
        return "redirect:/employeeEditor";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("id") Long id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/employeesEditor";
    }
//
//    @PostMapping("/findStudentByName")
//    public String findBaseByName(Model model, @RequestParam("nameToFind") String nameToFind) {
////        List<Base> foundList = baseRepository.findByName(nameToFind);
////        model.addAttribute("baseList", foundList);
//        return "bases";
//    }
//
//    @PostMapping("/findBaseByAdres")
//    public String findBaseByAdres(Model model,
//                                        @RequestParam("baseAdresToFind") String baseAdresToFind) {
////        List<Base> foundList = baseRepository.findByAdres(baseAdresToFind);
////        model.addAttribute("baseList", foundList);
//        return "bases";
//    }


}
