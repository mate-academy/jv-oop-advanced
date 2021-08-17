package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Colour getRandomColour() {
        int colourNumber = random.nextInt(4);
        Colour colour;
        switch (colourNumber) {
            case 1: colour = Colour.green;
                break;
            case 2: colour = Colour.blue;
                break;
            case 3: colour = Colour.black;
                break;
            default: colour = Colour.yellow;
                break;
        }
        return colour;
    }
}
