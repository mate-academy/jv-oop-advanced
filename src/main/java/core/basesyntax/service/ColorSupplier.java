package core.basesyntax.service;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    private Random randomColor = new Random();

    public String getRandomColor() {
        int randomColorNumber = randomColor.nextInt(Color.values().length);
        return Color.values()[randomColorNumber].name();
    }
}

