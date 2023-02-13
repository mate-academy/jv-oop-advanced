package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private static final int COLOR_BOUND = Color.values().length - 1;
    public String getRandomColor(){
        int colorNumber = random.nextInt(COLOR_BOUND);
        return Color.values()[colorNumber].name();
    }
}
