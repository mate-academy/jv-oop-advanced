package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Colors[] colorsArray = Colors.values();

    public String getRandomColor() {
        int randomIndex = random.nextInt(colorsArray.length);
        return colorsArray[randomIndex].name();
    }
}
