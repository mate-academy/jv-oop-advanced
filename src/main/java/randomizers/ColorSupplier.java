package randomizers;

import java.util.Random;
import randomizers.sourcerand.Color;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private static final int SIZE = COLORS.length;
    private static final Random RANDOM = new Random();

    public Color getRandomColor() {
        return COLORS[RANDOM.nextInt(SIZE)];
    }
}
