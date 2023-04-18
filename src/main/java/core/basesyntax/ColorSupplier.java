package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        String value = Colors.values() [index].toString();
        return value;

    }
}

