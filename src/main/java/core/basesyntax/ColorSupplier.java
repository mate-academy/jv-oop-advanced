package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private Random random = new Random();
    private Color[] colors = Color.values();
    private String randomColor;

    private void setRandomColor() {
        this.randomColor = colors[random.nextInt(colors.length)].toString();
    }

    public String getRandomColor() {
        setRandomColor();
        return randomColor;
    }

    public String getDefaultColor() {
        return DEFAULT_COLOR;
    }
}
