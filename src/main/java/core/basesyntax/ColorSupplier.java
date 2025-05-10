package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Color.values().length);

        String randomColor = String.valueOf(Color.values()[randomIndex]);

        return randomColor;
    }
}
