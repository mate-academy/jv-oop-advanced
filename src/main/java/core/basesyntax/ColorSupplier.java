package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random colorIndex = new Random();

    public String getRandomColor() {
        return Colors.values()[colorIndex.nextInt(Colors.values().length)].toString();
    }
}



