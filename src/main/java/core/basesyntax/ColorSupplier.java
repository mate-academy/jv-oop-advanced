package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    String getRandomColor() {
        Random random = new Random();
        return String.valueOf(Colors.values()[random.nextInt(Colors.values().length)]);
    }
}
