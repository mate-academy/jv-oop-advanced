package core.basesyntax.supplier;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    static final int COLOR_INDEX = new Random().nextInt(Color.values().length);
    static final String RANDOM_COLOR = Color.values()[COLOR_INDEX].name();

    public String getRandomColor() {
        return RANDOM_COLOR;
    }
}
