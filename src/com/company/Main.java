package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Wheel wheel = new Wheel();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter BRAND");
        String brand = scan.nextLine();
        System.out.println("Enter count of wheels");
        int countOfWheels = scan.nextInt();
        System.out.println("Enter diameter of wheels");
        double dWheels = scan.nextDouble();
        System.out.println("Enter type of wheels");
        String typeOfWheels = scan.next();
        double q = wheel.getPrice(brand, countOfWheels, dWheels, typeOfWheels);
        System.out.println("Your car brand is " +brand +", count of wheels is " +countOfWheels +", diameter of wheels is " +dWheels +", type of wheels is " +typeOfWheels +". Total price is " +q +" grivnas.");
    }
}
