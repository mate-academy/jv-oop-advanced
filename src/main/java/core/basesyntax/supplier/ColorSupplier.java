package core.basesyntax.supplier;

import core.basesyntax.model.Colors;
import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index].toString().toLowerCase();
    }
}
