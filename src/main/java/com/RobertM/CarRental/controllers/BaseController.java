package com.RobertM.CarRental.controllers;


import com.RobertM.CarRental.model.Base;
import com.RobertM.CarRental.model.BaseDto;
import com.RobertM.CarRental.repositories.BaseRepository;
import com.RobertM.CarRental.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BaseController {


    @Autowired
    BaseRepository baseRepository;

    @Autowired
    BaseService baseService;

    @GetMapping("/students")
    public String getAllBases(Model model) {
        List<BaseDto> bases = baseService.getAllBases();
        model.addAttribute("baseList", bases);
        return "students";
    }

//    @GetMapping("/addStudent")
//    public String addBaseForm() {
//        return "addStudent";
//    }
//
//    @PostMapping("/addStudent")
//    public String addBase(BaseDto baseDto) {
//        baseService.saveBase(baseDto);
//        return "redirect:/students";
//    }
//
//    @GetMapping("/editBase")
//    public String editBase(Model model,
//                           @RequestParam("id") Long id) {
//        BaseDto baseDto = baseService.getBaseById(id);
//        model.addAttribute("base", baseDto);
//        return "editBase";
//    }
//
//    @PostMapping("/editStudent")
//    public String saveEditedBase(BaseDto baseDto) {
//        baseService.saveBase(baseDto);
//        return "redirect:/bases";
//    }
//
//    @GetMapping("/deleteBase")
//    public String deleteBase(@RequestParam("id") Long id) {
//        baseService.deleteBaseById(id);
//        return "redirect:/bases";
//    }
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
