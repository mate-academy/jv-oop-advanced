package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Colors[] colors = Colors.values();

    public Colors getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
