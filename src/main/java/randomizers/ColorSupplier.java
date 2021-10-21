package randomizers;

import java.util.Random;
import randomizers.sourcerand.Color;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int size = colors.length;
        return colors[random.nextInt(size)].toString();
    }
}
