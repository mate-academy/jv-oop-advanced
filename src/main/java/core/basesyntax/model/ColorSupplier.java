package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    public static final int FIGURE_COUNT = 7;
    private String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
    private Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];

    }
}
