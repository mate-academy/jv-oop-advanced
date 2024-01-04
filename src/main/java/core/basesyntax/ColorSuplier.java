package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    public Color getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }

    public Color getDefaultColor() {
        return Color.WHITE;
    }
}
