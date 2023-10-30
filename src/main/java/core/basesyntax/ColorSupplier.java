package core.basesyntax;

import java.util.Random;

class ColorSupplier {

    private static final String[] colors = {"red", "green", "blue", "yellow", "purple",
            "orange", "pink"};
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
