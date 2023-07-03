package core.basesyntax.suppliers;

import core.basesyntax.state.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int number = random.nextInt(Color.values().length);
        return Color.values()[number].getColor();
    }
}
