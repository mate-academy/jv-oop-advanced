package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomColor = new Random();

    public String getRandomColor() {
        int index = randomColor.nextInt(Colors.values().length);
        return Colors.values()[index].toString().toLowerCase();
    }
}
