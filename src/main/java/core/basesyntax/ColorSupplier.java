package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colorsArray = new String[] {"white", "blue", "yellow"};
    private final Random random = new Random();

    public String getDefaultColor() {
        return colorsArray[0];
    }

    public String getRandomColor() {
        int randomIndex = random.nextInt(colorsArray.length);
        return colorsArray[randomIndex];
    }
}
