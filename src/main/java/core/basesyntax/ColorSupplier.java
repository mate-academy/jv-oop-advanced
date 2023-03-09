package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_NUMBER = 5;

    private Random random = new Random();

    public String getRandomColor() {
        Color[] color = Color.values();
        int index = random.nextInt(MAX_NUMBER - 1);
        return color[index].name();
    }
}
