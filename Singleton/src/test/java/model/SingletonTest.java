package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmakarov on 10/8/2015.
 */
public class SingletonTest {
    @Test
    public void SingletonEnumTest(){
        SingletonEnum.SingletonEn singleton_1 = SingletonEnum.SingletonEn.SINGLETON_EN;
        SingletonEnum.SingletonEn singleton_2 = SingletonEnum.SingletonEn.SINGLETON_EN;

        assertEquals(singleton_1, singleton_2);
    }

    @Test
    public void SingletonTest(){
        Singleton singleton_1 = Singleton.getInstance();
        Singleton singleton_2 = Singleton.getInstance();

        assertEquals(singleton_1, singleton_2);
    }

    @Test
    public void SingletonMultithreaded(){
        SingletonMultithreaded singleton_1 = SingletonMultithreaded.getInstance();
        SingletonMultithreaded singleton_2 = SingletonMultithreaded.getInstance();

        assertEquals(singleton_1, singleton_2);
    }

    @Test
    public void SingletonProtected(){
        SingletonPtotected singleton_1 = SingletonPtotected.getInstance();
        SingletonPtotected singleton_2 = SingletonPtotected.getInstance();

        String str;
        if (3>2) str="1"; else str="2";

        assertEquals(singleton_1, singleton_2);
    }


}
