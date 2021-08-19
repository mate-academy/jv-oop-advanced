package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] colors = Color.values();
    private int numberOfColors = colors.length;
    private String color = colors[random.nextInt(numberOfColors)].getColor();

    public String getRandomColor() {
        return color;
    }
}
