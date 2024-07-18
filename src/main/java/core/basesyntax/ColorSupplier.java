package core.basesyntax;

import java.util.Random;

public abstract class ColorSupplier extends Figure {
    private static final int COLOR_NUMBERS = 8;
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(COLOR_NUMBERS)].name();
    }

    public Random getRandom() {
        return random;
    }

}
