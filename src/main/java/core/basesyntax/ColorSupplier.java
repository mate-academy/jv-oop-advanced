package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String[] colors = new String[] {"red", "blue", "yellow", "green", "white"};
    private Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(5)];
    }
}
