package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    public static Color getRandomColor() {
        int colorIndex = new Random().nextInt(Color.values().length);
        return Color.values()[colorIndex];
    }
}
