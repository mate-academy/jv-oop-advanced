package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(FIGURE_COUNT);
        Color color = Color.values()[index];
        return color.name();
    }
}
