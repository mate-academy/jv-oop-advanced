package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors =
            {"red", "green", "blue", "yellow", "white", "orange", "purple"};

    public String getRandomColor() {
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex];
    }
}
