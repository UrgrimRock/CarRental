package com.RobertM.CarRental.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {



    @GetMapping("/user")
    public String user(){
        return ("<h1>Welecome User<h1>"+ admin());
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welecome Admin<h1>"+ testowanko());
    }

    @GetMapping("/testowanko")
    public String testowanko(){
        return ("<body>\n" +
                "\n" +
                "    <h1>Witaj w aplikacji pozawalającej wynająć auto!</h1>\n" +
                "\n" +
                "    Urzytkownik\n" +
                "    <button >\n" +
                "        <a href=\"/bases\">\n" +
                "            WYNAJMIJ AUTO\n" +
                "        </a>\n" +
                "    </button>\n" +
                "    <br><br><br>\n" +
                "    Admin\n" +
                "    <button >\n" +
                "        <a href=\"/basesEditor\">\n" +
                "            EDYTUJ Bazy\n" +
                "        </a>\n" +
                "    </button>\n" +
                "    <button >\n" +
                "        <a href=\"/employeesEditor\">\n" +
                "            Edytuj Pracowników\n" +
                "        </a>\n" +
                "    </button>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "</body>");
    }



}
