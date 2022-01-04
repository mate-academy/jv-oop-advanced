package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final String [] colors = new String[] {
            "Black","White", "Red", "Blue", "Green", "Yellow"};

    public String getRandomColor() {
        return colors [random.nextInt(colors.length)];
    }
}
