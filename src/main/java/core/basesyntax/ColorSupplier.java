package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] colors = Color.values();
    private int bound = colors.length;

    public Color getRandomColor () {
        return colors[random.nextInt(bound)];
    }

}
