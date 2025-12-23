package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = new String[]
            {"Blue", "White", "Black", "Orange", "Yellow", "Green", "Cyan", "Grey"};
    private final Random rand = new Random();

    public String getRandomColor() {
        int randomColor = rand.nextInt(colors.length);
        return colors[randomColor];
    }
}
