package core.basesyntax.supplier;

import core.basesyntax.enums.Color;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Color[] colors = Color.values();
        int index = new Random().nextInt(colors.length);
        Color color = colors[index];
        return color.name();
    }

}