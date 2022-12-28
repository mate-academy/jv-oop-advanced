package core.basesyntax.color;

import java.util.Random;

public class ColorSupplier {
    private final static Random random = new Random(System.currentTimeMillis());
    public String getRandomColor(){
        String randomColor = Color.values()[random.nextInt(Color.values().length)].name();

        return randomColor;
    }
}
