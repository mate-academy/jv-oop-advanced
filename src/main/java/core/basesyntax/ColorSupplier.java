package core.basesyntax;

import java.util.Random;

public class ColorSupplier implements RandomColor {

    private final Color[] colorValues = Color.values();
    private final Random random = new Random();

    @Override
    public String getRandomColor() {
        int index = random.nextInt(colorValues.length);
        return colorValues[index].name();
    }
}
