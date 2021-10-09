package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static String[] colorsList = new String[]{"yellow", "red", "green", "blue", "black"};
    private final Random random = new Random();

    public String getRandomColor() {
        return colorsList[random.nextInt(colorsList.length)];
    }
}
