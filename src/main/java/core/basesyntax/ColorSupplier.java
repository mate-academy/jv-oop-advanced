package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private final String[] colors = {"white", "black", "pink", "yellow", "blue", "purple"};

    public String getRandomColor() {
        int numberOfColor = random.nextInt(colors.length);
        return colors[numberOfColor];
    }

}
