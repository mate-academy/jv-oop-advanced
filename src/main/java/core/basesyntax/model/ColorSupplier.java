package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int colorLength = FigureColor.values().length;
        int randomColorPosition = random.nextInt(colorLength);
        String color = FigureColor.values()[randomColorPosition].name();
        return color;
    }
}
