package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int RANDOM_RANGE = 3;
    private Random randomColor = new Random();
    private String[] colors = new String[]{"red", "green", "blue", "yellow"};

    public String getRandomColor() {
        return colors[randomColor.nextInt(RANDOM_RANGE)];
    }
}
