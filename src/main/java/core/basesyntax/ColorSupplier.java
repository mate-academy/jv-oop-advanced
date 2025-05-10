package core.basesyntax;

import core.basesyntax.model.Colour;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Colour getRandomColour() {
        return Colour.values()[random.nextInt(Colour.values().length)];
    }

}
