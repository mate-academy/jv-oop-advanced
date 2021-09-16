package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private String[] colors = { "BLUE", "GREEN", "MAGENTA", "RED", "CYAN" };

    public String getRandomColor() {
        int pos = random.nextInt(colors.length);
        return colors[pos];
    }
}
