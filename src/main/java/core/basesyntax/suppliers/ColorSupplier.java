package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private Colors[] colorArray = Colors.values();
    private Random random = new Random();

    public Colors generateColor() {
        return colorArray[random.nextInt(colorArray.length)];
    }
}
