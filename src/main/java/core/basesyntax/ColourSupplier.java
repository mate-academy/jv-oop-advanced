package core.basesyntax;

import java.util.Random;

public class ColourSupplier {
    private final Random random = new Random();

    public String getRandomColour() {
        int index = random.nextInt(Colour.values().length);
        return Colour.values()[index].name().toLowerCase();
    }
}
