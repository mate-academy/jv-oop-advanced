package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {
            "white", "black", "red", "green", "blue", "yellow", "orange", "purple", "pink", "gray"
    };

    private Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
