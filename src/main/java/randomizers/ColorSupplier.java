package randomizers;

import java.util.Random;
import randomizers.sourcerand.Colors;

public class ColorSupplier {
    private static final Colors[] COLORS = Colors.values();
    private static final int SIZE = COLORS.length;
    private static final Random RANDOM = new Random();

    public Colors getRandomColor() {
        return COLORS[RANDOM.nextInt(SIZE)];
    }
}
