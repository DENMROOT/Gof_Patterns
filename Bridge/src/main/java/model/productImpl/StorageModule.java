package model.productImpl;

import model.Product;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class StorageModule implements Product {
    private final String productName;
    public StorageModule(String productName){
        this.productName = productName;
    }


    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Storage Module");
    }
}
