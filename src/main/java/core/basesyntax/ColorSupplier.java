package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = new String[] {"black", "white", "green", "red", "gray",
            "purple", "pink", "yellow", "brown", "blue", "orange"};

    public String randomColor() {
        int randomNumber = new Random().nextInt(colors.length);
        return colors[randomNumber];
    }
}
