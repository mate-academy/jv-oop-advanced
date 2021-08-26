package core.basesyntax;

import java.awt.Color;
import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        Color color = new Color(random.nextInt(20));
        return color;
    }
}
