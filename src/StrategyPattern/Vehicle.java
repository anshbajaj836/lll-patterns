package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.Strategy.NormalDriveStrategy;

public class Vehicle {

//    DriveStrategy driveObject = new NormalDriveStrategy();
    DriveStrategy driveObject;
    // this is known as constructor injuction
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }

}
