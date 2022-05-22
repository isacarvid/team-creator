package com.example.teamcreator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController("/api")
public class TeamCreatorController {
    @GetMapping("/names/{name}")
    public void addNewName(@PathVariable("name") String name) {

        System.out.println(name);
    }

}
