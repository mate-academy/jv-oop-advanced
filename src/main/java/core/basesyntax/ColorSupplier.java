package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[]
            {"red", "green", "yellow", "blue", "black", "white"};

    public String getRandomColor() {
        int randomColor = new Random().nextInt(COLORS.length);
        return COLORS[randomColor];
    }
}
