package com.company;

public class Wheel extends Car {

    public double dWheel;
    private String metalType = "M";
    private String titanType = "T";

    public double getPrice(String brand, int countOfWheels, double dWheel, String type){
        this.dWheel = dWheel;
        wheel = countOfWheels;
        this.brand = brand;
        for(int i = 0; i< Light.values().length; i++){
            if(Light.values()[i].name().equalsIgnoreCase(brand)){
                price = 500;
            }
        }
        for(int i = 0; i< Heavy.values().length; i++){
            if(Heavy.values()[i].name().equalsIgnoreCase(brand)){
                price = 1000;
            }
        }
        if (dWheel==12 && type.equalsIgnoreCase(metalType)){
            price = price + 500 * countOfWheels;
        }
        if (dWheel==12 && type.equalsIgnoreCase(titanType)){
            price = price + 1000 * countOfWheels;
        }
        if (dWheel==14 && type.equalsIgnoreCase(metalType)){
            price = price + 800 * countOfWheels;
        }
        if (dWheel==14 && type.equalsIgnoreCase(titanType)){
            price = price + 1600 * countOfWheels;
        }
        if (dWheel==16 && type.equalsIgnoreCase(metalType)){
            price = price + 1000 * countOfWheels;
        }
        if (dWheel==16 && type.equalsIgnoreCase(titanType)){
            price = price + 2000 * countOfWheels;
        }
        return super.getPrice();
    }
}
