package com.insat.demo.controller;

import com.insat.demo.entity.Enseignant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

    @RequestMapping("/enseignant")
    public List<String> getAllPersons() {
        Enseignant enseignant1 = new Enseignant(
                "1",
                "Syrine",
                "Barnoussi"
        );

        Enseignant enseignant2 = new Enseignant(
                "2",
                "Yosra",
                "Abdessamed"
        );

        return Arrays.asList(enseignant1.firstname, enseignant2.firstname);

    }
}
