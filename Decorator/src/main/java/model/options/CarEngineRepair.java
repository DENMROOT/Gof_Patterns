package model.options;

import model.CarRepair;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class CarEngineRepair extends CarRepairDecorator {
    private final CarRepair carRepair;

    public CarEngineRepair(CarRepair carRepair) {
        this.carRepair = carRepair;
    }

    @Override
    public String getDescription() {
        return carRepair.getDescription() + " , car engine repair (15.0)";
    }

    @Override
    public double getPrice() {
        return carRepair.getPrice() + 15.0;
    }
}
