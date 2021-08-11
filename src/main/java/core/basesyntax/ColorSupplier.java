package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] allColors = Colors.values();
        Random random = new Random();
        int randomIndex = random.nextInt(allColors.length);
        return allColors[randomIndex].toString();
    }
}
