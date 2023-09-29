package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Colors[] colorsArray = Colors.values();
        int randomIndex = random.nextInt(colorsArray.length);
        return colorsArray[randomIndex].name();
    }
}
