package core.basesyntax.service;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        int numberOfColors = Color.values().length;
        int randomColorIndex = random.nextInt(numberOfColors);
        return Color.values()[randomColorIndex];
    }
}
