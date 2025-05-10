package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors =
            {"Blue", "Green", "Yellow", "Red", "Black", "Brown", "Violet"};

    public String getRandomColor() {
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex];
    }
}
