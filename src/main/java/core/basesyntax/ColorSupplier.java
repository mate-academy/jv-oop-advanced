package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColour() {
        int colourNumber = random.nextInt(4);
        String colour;
        switch (colourNumber) {
            case 1: colour = "black";
                break;
            case 2: colour = "white";
                break;
            case 3: colour = "red";
                break;
            default: colour = "yellow";
                break;
        }
        return colour;
    }
}
