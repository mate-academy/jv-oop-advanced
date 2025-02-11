package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = Colors.values().length;
        String colour = (Colors.values()[random.nextInt(index)].name());
        return colour;
    }
}
