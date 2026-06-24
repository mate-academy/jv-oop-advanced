package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String randomColor;
    private final Random random = new Random();

    public String getRandomColor() {
        randomColor = Color.values()[random.nextInt(Color.values().length)].name();
        return randomColor;
    }
}
