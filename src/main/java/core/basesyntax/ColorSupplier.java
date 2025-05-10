package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();
    private static final String[] COLORS = new String[]{
            "black", "green", "blue","yellow", "pink"
    };

    public String generateRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
