package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colorsList = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(colorsList.length);
        return colorsList[randomColorIndex].name();
    }
}
