package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomColor = new Random();

    public Color getRandomColor() {
        int randomIndex = randomColor.nextInt(Color.values().length);
        return Color.values()[randomIndex];
    }
}
