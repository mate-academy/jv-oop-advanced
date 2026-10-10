package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int i = random.nextInt(colors.length);

        return colors[i].name();
    }
}
