package decorator.model;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class ExtendedCarRepair implements CarRepair {
    @Override
    public String getDescription() {
        return "Extended Car Repair (12.5)";
    }

    @Override
    public double getPrice() {
        return 12.5;
    }
}
