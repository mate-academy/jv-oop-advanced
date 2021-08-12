package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Colors[] allColors = Colors.values();
        int randomIndex = random.nextInt(allColors.length);
        return allColors[randomIndex].toString();
    }
}
