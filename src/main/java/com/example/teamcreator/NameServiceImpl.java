package com.example.teamcreator;

import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class NameServiceImpl implements NameService{

    public static final String FILENAME_TXT = "names.json";

    @Override
    public List<String> getNames(){
        var names = new ArrayList<String>();
        names.add("Isac");
        names.add("Theo");
        return names;
    }

    @Override
    public void addName(String name) {
        System.out.println(readFromFile());
    }

    public String readFromFile() {
        String content = "";
        try {
            File myObj = new File(FILENAME_TXT);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                content = content.concat(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return content;
    }
    public void writeToFile(String content) {
        try {
            FileWriter myWriter = new FileWriter(FILENAME_TXT);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
