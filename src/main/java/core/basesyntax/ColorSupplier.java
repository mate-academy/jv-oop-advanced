package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static final String[] COLORS = {"red", "blue", "green", "purple", "white", "black"};

    public String getRandomColor() {
        int rnd = new Random().nextInt(COLORS.length);
        return COLORS[rnd];
    }
}
