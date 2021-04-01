package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_NUM = 10;
    private final String[] colors = {"red", "blue", "yellow", "green", "white",
            "pink", "violet", "black", "orange", "grey"};
    private Random random = new Random();

    public String getColor() {
        return colors[random.nextInt(MAX_NUM)];
    }
}
