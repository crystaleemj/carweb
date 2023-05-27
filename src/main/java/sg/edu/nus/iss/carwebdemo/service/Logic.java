package sg.edu.nus.iss.carwebdemo.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import sg.edu.nus.iss.carwebdemo.model.Car;

@Component
public class Logic {
    
    public Car showCar(String model) throws IOException{
    
    Car c = new Car();

    String path = "src/main/resources/data/" + model;
    File file = new File(path);
    // File f = new File(".");
    
    
    // if (f.isDirectory()){
    //     File[] fileList = f.listFiles();
    //     System.out.println(fileList[0].getName());
    // }

    // if (file.exists()){
    //     System.out.println("File exists");
    // } else {
    //     System.out.println("File don't exist");
    // }

    BufferedReader br = new BufferedReader(new FileReader(file));

    c.setBrand(br.readLine());
    c.setModel(br.readLine());
    c.setYear(br.readLine());
    c.setTransmission(br.readLine());
    c.setColor(br.readLine());

    br.close();


    return c;

    }
}
