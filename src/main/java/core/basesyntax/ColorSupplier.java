package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;
    private String[] simpleColors = {
            "Red", "Green", "Blue", "Yellow", "Orange", "Purple", "Pink", "Cyan"
    };

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        int randomIndex = random.nextInt(simpleColors.length);
        return simpleColors[randomIndex];
    }
}
