package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomValue = new Random();;
    private int colorsCount;

    public String getRandomColor() {
        colorsCount = Color.values().length;
        int colorPosition = randomValue.nextInt(colorsCount);
        String randomColor = Color.values()[colorPosition].name();
        return randomColor;
    }
}
