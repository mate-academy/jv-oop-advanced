package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomValue;
    private int colorsCount;
    private int colorPosition;
    private String randomColor;

    public String getRandomColor() {
        colorsCount = Color.values().length;
        randomValue = new Random();
        colorPosition = randomValue.nextInt(colorsCount);
        randomColor = Color.values()[colorPosition].name();
        return randomColor;
    }
}
