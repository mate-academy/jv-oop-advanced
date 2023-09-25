package core.basesyntax.randomizer;

import core.basesyntax.model.Colors;
import java.util.Random;

public class ColorSupplier {
    private int index = new Random().nextInt(Colors.values().length - 1);

    public String getRandomColor() {
        return Colors.values()[index].name();
    }
}
