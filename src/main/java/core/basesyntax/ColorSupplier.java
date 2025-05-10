package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] simpleColors = Colors.values();
    private final Random random = new Random();

    public String getRandomColor() {
        Colors randColor = simpleColors[random.nextInt(simpleColors.length)];
        return randColor.toString();
    }
}
