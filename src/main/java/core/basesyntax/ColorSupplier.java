package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] valuesArray = Color.values();

    public Color getRandomColor() {
        int index = random.nextInt(valuesArray.length);
        return valuesArray[index];
    }
}
