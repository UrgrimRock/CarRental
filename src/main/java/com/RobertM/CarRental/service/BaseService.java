package com.RobertM.CarRental.service;

import com.RobertM.CarRental.mapper.BaseMapper;
import com.RobertM.CarRental.model.Base;
import com.RobertM.CarRental.model.BaseDto;
import com.RobertM.CarRental.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BaseService {

    @Autowired
    private BaseRepository baseRepository;

    public BaseService(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }

    public List<BaseDto> getAllBases(){
        Iterable<Base> baseList= baseRepository.findAll();
        ArrayList<BaseDto> result = new ArrayList<>();
        for (Base base : baseList){
            result.add(BaseMapper.INSTANCE.baseToDto(base));

        }
        return result;
    }
    public void deleteBaseById(Long id) {
        baseRepository.deleteById(id);
    }

    public BaseDto getBaseById(Long id) {
        Optional<Base> student = baseRepository.findById(id);
        if(student.isPresent()) {
            return BaseMapper.INSTANCE.baseToDto(student.get());
        }
        return null;
    }


    public void saveBase(BaseDto baseDto){
        Base base = BaseMapper.INSTANCE.dtoToBase(baseDto);
        baseRepository.save(base);
    }
}
