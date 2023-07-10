package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int indexRandom = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[indexRandom];
        String randomColor = color.name();
        return randomColor;
    }
}
