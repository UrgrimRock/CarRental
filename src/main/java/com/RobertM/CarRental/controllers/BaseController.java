package com.RobertM.CarRental.controllers;


import com.RobertM.CarRental.model.dto.BaseDto;
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

    @GetMapping("/bases")
    public String getAllBases(Model model) {
        List<BaseDto> bases = baseService.getAllBases();
        model.addAttribute("basesList", bases);
        return "bases";
    }
    @GetMapping("/basesEditor")
    public String getAllBasesAdmin(Model model) {
        List<BaseDto> bases = baseService.getAllBases();
        model.addAttribute("basesList", bases);
        return "basesEditor";
    }

    @GetMapping("/addBase")
    public String addBaseForm() {
        return "addBase";
    }

    @PostMapping("/addBase")
    public String addBase(BaseDto baseDto) {
        baseService.saveBase(baseDto);
        return "redirect:/basesEditor";
    }

    @GetMapping("/editBase")
    public String editBase(Model model,
                           @RequestParam("id") Long id) {
        BaseDto baseDto = baseService.getBaseById(id);
        model.addAttribute("base", baseDto);
        return "editBase";
    }

    @PostMapping("/editBase")
    public String saveEditedBase(BaseDto baseDto) {
        baseService.saveBase(baseDto);
        return "redirect:/basesEditor";
    }

    @GetMapping("/deleteBase")
    public String deleteBase(@RequestParam("id") Long id) {
        baseService.deleteBaseById(id);
        return "redirect:/basesEditor";
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
