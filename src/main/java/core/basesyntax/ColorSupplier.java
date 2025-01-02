package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random picker = new Random();

    public Colors getRandomColor() {
        return Colors.values()[picker.nextInt(Colors.values().length)];
    }
}
