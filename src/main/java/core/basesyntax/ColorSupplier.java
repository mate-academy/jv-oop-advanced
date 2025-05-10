package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        new Random();
        int colorIndex = new Random().nextInt(Color.values().length);
        return Color.values()[colorIndex].name();
    }
}
