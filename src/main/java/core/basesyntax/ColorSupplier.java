package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomColor = new Random();
    private int randomIndex = randomColor.nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[randomIndex];
    }
}
