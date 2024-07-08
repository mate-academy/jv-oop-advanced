package utility;

import java.util.Random;
import model.Color;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final Color[] colors = Color.values();

    public String getRandomColor() {
        final int index = random.nextInt(colors.length);
        return colors[index].name().toLowerCase();
    }
}
