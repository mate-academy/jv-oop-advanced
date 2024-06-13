package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_NUMBER = 4;
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLOR_NUMBER);
        Color color = Color.values()[index];
        return color.name();
    }
}
