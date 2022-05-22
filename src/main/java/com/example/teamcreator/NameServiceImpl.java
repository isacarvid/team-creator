package com.example.teamcreator;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NameServiceImpl implements NameService{

    @Override
    public List<String> getNames(){
        var names = new ArrayList<String>();
        names.add("Isac");
        names.add("Theo");
        return names;
    }
}
