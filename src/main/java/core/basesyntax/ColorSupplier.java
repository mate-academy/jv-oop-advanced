package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[] {"black", "white", "green", "red", "gray",
            "purple", "pink", "yellow", "brown", "blue", "orange"};

    public String getRandomColor() {
        int randomNumber = new Random().nextInt(COLORS.length);
        return COLORS[randomNumber];
    }
}
