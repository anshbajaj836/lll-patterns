package StrategyPattern;

import StrategyPattern.Strategy.SportsCarStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsCarStrategy());
    }

}
