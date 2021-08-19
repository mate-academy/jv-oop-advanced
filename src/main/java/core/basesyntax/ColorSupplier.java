package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLOR = new String[] {"red", "green", "blue",
                                                        "black", "white", "purple"};

    public String getRandomColor() {
        return COLOR[new Random().nextInt(COLOR.length)];
    }
}
