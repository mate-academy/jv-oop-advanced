package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"green", "blue", "brown", "purple", "yellow"};
    private final Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}
