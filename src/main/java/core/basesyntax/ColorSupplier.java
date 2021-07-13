package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Colors[] values = Colors.values();
        int randomIndex = new Random().nextInt(Colors.values().length);
        return values[randomIndex].name();
    }
}
