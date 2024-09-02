package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] color = new String[]{"Black", "Yellow", "Orange",
            "White", "Purple", "Blue", "Green", "Pink"};
    private static final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(color.length);
        return color[index];
    }
}
