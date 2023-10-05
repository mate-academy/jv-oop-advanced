package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    private Color generatedColor;

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        generatedColor = Color.values()[index];
        return generatedColor;
    }
}
