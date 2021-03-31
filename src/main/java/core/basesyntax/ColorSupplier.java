package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_NUM_FOR_COLOR = 10;
    Random ranColor = new Random();
    private final String[] COLORS = {"red", "blue", "yellow", "green", "white",
                       "pink", "violet", "black", "orange", "grey"};

    public String getColor() {
        return COLORS[ranColor.nextInt(MAX_NUM_FOR_COLOR)];
    }
}
