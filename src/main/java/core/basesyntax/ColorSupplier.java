package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String [] colors = {"Red", "Orange", "Green", "Yellow",
                                             "Blue", "Violet", "Black"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
