package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    int index = random.nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[index].name();
    }
}
