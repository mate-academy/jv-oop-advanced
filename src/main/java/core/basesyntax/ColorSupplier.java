package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"white", "black", "red", "blue", "green", "yellow"};

    private static Random random = new Random();

    public String getRandomColor() {

        return COLORS[random.nextInt(COLORS.length)];
    }
}
