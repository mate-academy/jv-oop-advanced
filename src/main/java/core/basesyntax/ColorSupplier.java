package core.basesyntax;

import core.basesyntax.figures.Colors;
import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[new Random().nextInt(colors.length)].toString();
    }
}
