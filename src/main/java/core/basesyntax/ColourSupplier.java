package core.basesyntax;

import java.util.Random;

public class ColourSupplier {
    private static final int COLOUR_COUNT = 5;
    private Random random = new Random();

    public String getRandomColour() {
        return Colour.values()[random.nextInt(COLOUR_COUNT)].name();
    }
}
