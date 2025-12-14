package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final Random random = new Random();

    private final String[] colors = new String[] {
            "red", "blue", "pink", "black", "white", "green"
    };

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
