package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        String[] colors = {"green", "red", "yellow", "white", "blue", "black"};
        return colors[random.nextInt(colors.length)];
    }
}
