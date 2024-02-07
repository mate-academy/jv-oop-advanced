package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int maxColor = Color.values().length;
        int randomIndex = random.nextInt(maxColor);

        return Color.values()[randomIndex];
    }
}
