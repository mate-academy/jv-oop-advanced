package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        String[] colors = {"red", "blue", "green", "yellow", "orange", "white", "black"};
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
