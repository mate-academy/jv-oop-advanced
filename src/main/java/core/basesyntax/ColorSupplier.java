package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int colorNumber = random.nextInt(Color.values().length);
        return Color.values()[colorNumber].name();
    }
}
