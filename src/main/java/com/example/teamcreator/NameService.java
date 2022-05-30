package com.example.teamcreator;

import java.util.List;

public interface NameService {
    List<String> getNames();

    void addName(String name);
}
