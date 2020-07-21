package com.RobertM.CarRental.mapper;

import com.RobertM.CarRental.model.entity.Base;
import com.RobertM.CarRental.model.dto.BaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BaseMapper {
    BaseMapper INSTANCE = Mappers.getMapper(BaseMapper.class);

    BaseDto baseToDto(Base base);
    Base dtoToBase(BaseDto baseDto);


    List<BaseDto> baseListToDto(List<Base> base);
    List<Base> dtoToBase(List<BaseDto> baseDtos);
}
