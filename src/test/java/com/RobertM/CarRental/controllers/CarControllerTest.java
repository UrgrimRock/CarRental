package com.RobertM.CarRental.controllers;

import com.RobertM.CarRental.model.entity.Base;
import com.RobertM.CarRental.repositories.BaseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    BaseRepository baseRepository;

    @Test
    void addCarForm() throws Exception {
        Base base1 = new Base("Baz2","Adres1");
        baseRepository.save(base1);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/addCar"))
//                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(header().exists("Content-Language"));
//                .andExpect(content().string("Baz2"));
    }
}