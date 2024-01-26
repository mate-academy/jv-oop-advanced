package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Color.values().length);
        Color color = Color.values()[randomIndex];
        return color.name().toLowerCase();
    }
}
