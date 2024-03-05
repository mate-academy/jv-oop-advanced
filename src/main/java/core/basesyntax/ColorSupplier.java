package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();
    private Random random = new Random();

    public Color getRandomColor() {
        int randomNum = random.nextInt(colors.length);
        return Color.values()[randomNum];
    }
}
