package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Colors[] colorsList = Colors.values();
    private static final Random random = new Random();

    public static String getRandomColor() {
        int randomColorIndex = random.nextInt(colorsList.length);
        return colorsList[randomColorIndex].name();
    }
}
