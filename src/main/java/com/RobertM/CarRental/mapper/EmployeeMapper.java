package com.RobertM.CarRental.mapper;


import com.RobertM.CarRental.model.dto.EmployeeDto;
import com.RobertM.CarRental.model.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDto employeeToDto(Employee employee);
    Employee dtoToEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> employeeListToDto(List<Employee> employees);
    List<Employee> dtoToEmployee(List<EmployeeDto> employeeDtos);
}
