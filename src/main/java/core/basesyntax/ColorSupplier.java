package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_NUMBER = 5;

    private Random random = new Random();

    public String getRandomColor() {
        Color[] color = Color.values();
        return color[MAX_NUMBER].name();
    }
}
