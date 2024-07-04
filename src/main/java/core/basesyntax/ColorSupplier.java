package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomColor = new Random();
    private Color[] colors = Color.values();

    public String getRandomColor() {
        int randomIndex = randomColor.nextInt(colors.length);
        return colors[randomIndex].name().toLowerCase();
    }
}
