package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();
    private String[] colors = {"White", "Red", "Orange", "Yellow", "Green", "Blue", "Violet"};

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
