package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLOR = {"Pink", "Green", "Purple", "Red", "White", "Black"};

    public String getRandomColor() {
        Random randomColor = new Random();
        return COLOR[randomColor.nextInt(COLOR.length)];
    }
}
