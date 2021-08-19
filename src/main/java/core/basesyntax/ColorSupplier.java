package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        final String[] colors = new String[]{"Red", "Blue", "Green", "Black", "White"};
        int colorNumber = random.nextInt(colors.length);
        return colors[colorNumber];
    }
}
