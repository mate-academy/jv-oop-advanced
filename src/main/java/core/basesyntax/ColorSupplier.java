package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public enum Color {
        RED, BLUE, YELLOW, GREEN, ORANGE, BLACK;
    }

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomNumber = random.nextInt(colors.length);
        return colors[randomNumber];
    }
}
