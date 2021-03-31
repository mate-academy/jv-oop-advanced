package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "yellow", "grey", "black", "pink"};

    public String getRandomColor() {
        int randomColor = new Random().nextInt(COLORS.length);
        return COLORS[randomColor];
    }
}
