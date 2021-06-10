package com.example.myfirstapp.controller;

import com.example.myfirstapp.lib.Car;
import com.example.myfirstapp.lib.Manufacturer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String hello() {

        return "Hello javaTpoint";
    }

    @RequestMapping("/tutorial")
    public String tutorial() {
        Car honda = new Car("Honda");
        Car city = new Car("City");

        Manufacturer yamamoto = new Manufacturer("Yamamoto Holdings");

        yamamoto.addProduction(honda);
        yamamoto.addProduction(city);

        return yamamoto.cars.get(0).model;
    }

}
