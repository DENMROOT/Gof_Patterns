package bridge.model.productImpl;

import bridge.model.Product;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class WashingModule implements Product {
    private final String productName;
    public WashingModule(String productName){
        this.productName = productName;
    }


    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Washing Module");
    }
}
