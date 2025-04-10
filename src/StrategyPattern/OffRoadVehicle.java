package StrategyPattern;

import StrategyPattern.Strategy.SportsCarStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle(){
        super(new SportsCarStrategy());
    }
    // super --> parent constructor


}
