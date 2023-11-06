package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] randomColors = {"green", "red", "yellow", "purple", "black"};

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(randomColors.length);
        return randomColors[index];
    }
}
