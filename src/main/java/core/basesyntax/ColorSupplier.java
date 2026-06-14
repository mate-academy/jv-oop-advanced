package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = {"WHITE", "BLACK", "SILVER", "BLUE", "ORANGE"};
    private final Random random = new Random();

    public String getRandomColor() {
        int randomColor = random.nextInt(colors.length);
        return colors[randomColor];
    }
}
