package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColour() {
        int colorRandomNumber = random.nextInt(5);
        return Colour.values()[colorRandomNumber].toString().toLowerCase();
    }
}
