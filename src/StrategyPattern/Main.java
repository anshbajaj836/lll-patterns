package StrategyPattern;

import java.util.Vector;

public class Main {

    public static void main(String args[]){
        Vehicle sportsVehicle = new SportsVehicle();

        sportsVehicle.drive();


        Vehicle goodsVehicle = new GoodsVehicle();

        goodsVehicle.drive();
    }

}
