package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = new String[] {"White", "Gray", "Pink",
            "Purple", "Blue", "Aqua", "Green",
            "Yellow", "Orange", "Red"};

    public String getRandomColor() {
        Random generator = new Random();
        int randomIndex = generator.nextInt(colors.length);
        return colors[randomIndex];
    }
}
