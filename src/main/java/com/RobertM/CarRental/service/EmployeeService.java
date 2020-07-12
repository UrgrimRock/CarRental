package com.RobertM.CarRental.service;


import com.RobertM.CarRental.mapper.EmployeeMapper;
import com.RobertM.CarRental.model.dto.CarDto;
import com.RobertM.CarRental.model.dto.EmployeeDto;
import com.RobertM.CarRental.model.entity.Employee;

import com.RobertM.CarRental.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDto> getAllEmployee(){
        Iterable<Employee> employeeList= employeeRepository.findAll();
        ArrayList<EmployeeDto> result = new ArrayList<>();
        for (Employee employee : employeeList){
            result.add(EmployeeMapper.INSTANCE.employeeToDto(employee));
        }
        return result;
    }
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    public EmployeeDto getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()) {
            return EmployeeMapper.INSTANCE.employeeToDto(employee.get());
        }
        return null;
    }


    public void saveEmployee(EmployeeDto employeeDto){
        Employee employee = EmployeeMapper.INSTANCE.dtoToEmployee(employeeDto);
        employeeRepository.save(employee);
    }
}
