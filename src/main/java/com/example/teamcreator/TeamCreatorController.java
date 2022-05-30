package com.example.teamcreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@Component
@RestController
@RequestMapping("api/v1/")
public class TeamCreatorController {
    private NameService nameService;

    public TeamCreatorController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names/{name}")
    public void addNewName(@PathVariable("name") String name) {
        System.out.println(name);
        nameService.addName(name);
    }
    @GetMapping("/names")
    public List<String> getAllNames(){
        return nameService.getNames();
    }

}
