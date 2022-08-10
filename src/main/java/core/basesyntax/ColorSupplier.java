package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random INDEX = new Random();

    public String getRandomColor() {
        return Colors.values()[INDEX.nextInt(Colors.values().length)].getTitle();
    }
}