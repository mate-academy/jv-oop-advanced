package core.basesyntax.supplier;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {

    public String randomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)].name();
    }

    public String getRandomColor() {
        return randomColor();
    }
}
