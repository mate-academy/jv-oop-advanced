package core.basesyntax.color;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random(System.currentTimeMillis());
    public String getRandomColor(){
        return Color.values()[RANDOM.nextInt(Color.values().length)].name().toLowerCase();
    }
}
