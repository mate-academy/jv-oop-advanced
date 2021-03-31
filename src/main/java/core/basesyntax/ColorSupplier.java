package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_NUM = 10;
    private Random ranColor = new Random();
    private final String[] colors = {"red", "blue", "yellow", "green", "white",
            "pink", "violet", "black", "orange", "grey"};

    public String getColor() {
        return colors[ranColor.nextInt(MAX_NUM)];
    }
}
