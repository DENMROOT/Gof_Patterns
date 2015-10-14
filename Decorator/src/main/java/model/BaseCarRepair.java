package model;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class BaseCarRepair implements CarRepair {
    @Override
    public String getDescription() {
        return " Base Car Repair (10.0)";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
