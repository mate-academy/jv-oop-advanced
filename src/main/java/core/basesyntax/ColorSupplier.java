package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        String[] colors =
                {"brown", "yellow", "red", "pink", "white", "black", "orange", "violet", "blue"};
        return colors[random.nextInt(colors.length)];
    }
}

