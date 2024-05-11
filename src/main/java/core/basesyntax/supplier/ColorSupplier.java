package core.basesyntax.supplier;

import core.basesyntax.domain.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int random = new Random().nextInt(Color.values().length);
        return Color.values()[random].toString();
    }
}
