package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Colors.values().length);

        // Get the color code at the randomly chosen index
        String randomColor = String.valueOf(Colors.values()[randomIndex]);

        return randomColor;
    }
}
