package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorType getRandomColor() {

        ColorType[] colors = ColorType.values();
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex];
    }
}

