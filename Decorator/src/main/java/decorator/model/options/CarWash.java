package decorator.model.options;

import decorator.model.CarRepair;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class CarWash extends CarRepairDecorator {
    private final CarRepair carRepair;

    public CarWash(CarRepair carRepair) {
        this.carRepair = carRepair;
    }

    @Override
    public String getDescription() {
        return carRepair.getDescription() + " , car wash (2.5)";
    }

    @Override
    public double getPrice() {
        return carRepair.getPrice() + 2.5;
    }
}
