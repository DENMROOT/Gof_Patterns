package model.options;

import model.CarRepair;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class CarEngineCheck extends CarRepairDecorator {
    private final CarRepair carRepair;

    public CarEngineCheck(CarRepair carRepair) {
        this.carRepair = carRepair;
    }

    @Override
    public String getDescription() {
        return carRepair.getDescription() + " , car engine check (5.0)";
    }

    @Override
    public double getPrice() {
        return carRepair.getPrice() + 5.0;
    }
}
