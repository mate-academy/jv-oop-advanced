package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Colors[] color = Colors.values();
        int randomIndex = random.nextInt(color.length);
        return color[randomIndex].name();
    }
}
