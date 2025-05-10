package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 5;
    private Random random = new Random();
    // Массив из пяти цветов

    public String getRandomColor() {
        String[] colors = { "BLUE", "GREEN", "MAGENTA", "RED", "CYAN" };
        int pos = random.nextInt(colors.length);
        return colors[pos];
    }
}
