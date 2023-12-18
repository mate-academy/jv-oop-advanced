package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        String[] colors = {"red", "blue", "yellow", "green", "orange"};
        int randomNumber = random.nextInt(colors.length);
        return colors[randomNumber];
    }
}
