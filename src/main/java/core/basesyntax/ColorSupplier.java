package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomCS = new Random();
    private Color[] colors = Color.values();

    public Color getRandomColor() {
        int randomIndex = randomCS.nextInt(colors.length);
        return colors[randomIndex];
    }
}
