package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class ColorSupplier {
    Colors[] colors = Colors.values();
    Random random = new Random();

    public String getRandomColor() {
        return "" + random.nextInt(colors.length);
    }
}
