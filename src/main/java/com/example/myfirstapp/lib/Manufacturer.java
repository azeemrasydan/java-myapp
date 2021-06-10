package com.example.myfirstapp.lib;

import java.util.*;

public class Manufacturer {

    public List<Car> cars = new ArrayList<Car>();

    String name;

    public Manufacturer(String manufacturerName) {

        name = manufacturerName;
    }

    public void addProduction(Car carModel){

        cars.add(carModel);

    }

}
