package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int colorsNum = Color.values().length;
        int colorIndex = new Random().nextInt(colorsNum);
        return Color.values()[colorIndex].toString();
    }
}
