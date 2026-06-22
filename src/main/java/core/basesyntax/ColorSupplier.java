package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Colors[] colors = Colors.values();
    private Random random = new Random();

    public String getRandomColor() {
        return "" + random.nextInt(colors.length);
    }
}
