package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] COLORS = Color.values();

    public String getRandomColor() {
        int randomIndex = random.nextInt(COLORS.length);
        return COLORS[randomIndex].name();
    }
}
