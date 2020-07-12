package com.RobertM.CarRental.mapper;

import com.RobertM.CarRental.model.dto.CarDto;
import com.RobertM.CarRental.model.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto carToDto(Car car);
    Car dtoToCar(CarDto carDto);

    List<CarDto> carListToDto(List<Car> cars);
    List<Car> dtoToCar(List<CarDto> carDtos);
}