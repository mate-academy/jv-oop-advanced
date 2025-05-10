package core.basesyntax.figures;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}
