package flyweight.model;

import java.util.Random;

/**
 * Created by User on 18.10.2015.
 */
public enum FieldType {
    NUMBER_1,NUMBER_2,NUMBER_3,NUMBER_4,NUMBER_5,NUMBER_6,BLANK,FLAG,BOMB;

    private static final FieldType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static FieldType getRandomFieldType()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
