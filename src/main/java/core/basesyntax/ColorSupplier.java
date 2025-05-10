package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"RED", "BLUE", "GREEN", "YELLOW", "ORANGE", "WHITE"};

    public String getRandomColor() {
        Random rand = new Random();
        return COLORS[rand.nextInt(COLORS.length)];
    }
}
