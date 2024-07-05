package core.basesyntax.color;

import core.basesyntax.color.Color;

import java.util.Random;

public class ColorSupplier {

    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}
