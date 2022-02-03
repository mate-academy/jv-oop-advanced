package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(Random random) {
        int index = random.nextInt(Color.values().length - 1);
        return Color.values()[index].name();
    }
}
