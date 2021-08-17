package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Colour getRandomColour() {
        int colourNumber = random.nextInt(4);
        return Colour.values()[colourNumber];
    }
}
