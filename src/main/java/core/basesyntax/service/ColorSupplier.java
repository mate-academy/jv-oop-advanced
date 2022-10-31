package core.basesyntax.service;

import core.basesyntax.Colors;
import java.util.Random;

public class ColorSupplier {
    private Colors[] colors = Colors.values();

    public String getRandomColor() {
        return colors[new Random().nextInt(colors.length)].toString();
    }
}
