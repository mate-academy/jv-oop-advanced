package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int colorLength = ColorOfFigure.values().length;
        int randomColorPosition = random.nextInt(colorLength);
        String color = ColorOfFigure.values()[randomColorPosition].name();
        return color;
    }
}
