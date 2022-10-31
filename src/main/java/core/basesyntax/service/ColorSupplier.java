package core.basesyntax.service;

import core.basesyntax.Colors;
import java.util.Random;

public class ColorSupplier {
    private Random randomColor = new Random();

    public String getRandomColor() {
        return Colors.values()[randomColor.nextInt(Colors.values().length)].name();
    }
}
