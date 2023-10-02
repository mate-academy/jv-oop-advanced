package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"white", "yellow", "green", "blue", "purple"};
    private static final int NUMBER_OF_COLORS = colors.length;
    private Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(NUMBER_OF_COLORS)];
    }
}
