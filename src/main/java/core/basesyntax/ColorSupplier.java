package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values() [index].toString();
    }
}

