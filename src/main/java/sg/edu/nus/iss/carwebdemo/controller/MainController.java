package sg.edu.nus.iss.carwebdemo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.carwebdemo.model.Car;
import sg.edu.nus.iss.carwebdemo.service.Logic;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    Logic service;
    

    @GetMapping
    public String homePage(Model model){
        
        model.addAttribute("car", new Car());
        return "index";
    }

    @GetMapping (path = "/cars/{carModel}")
    public String carPage(Model model, Car car, @PathVariable String carModel) throws IOException{

        System.out.println(carModel);
       car = service.showCar(carModel + ".txt");
       System.out.println(carModel);
        
        model.addAttribute("newcar", car);
        model.addAttribute("imageName", carModel);
        
        System.out.println(carModel);

        return "cars";
    }
}

