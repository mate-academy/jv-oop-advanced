package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] Colors = Color.values();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Colors.length);
        return Colors[randomIndex].name().toLowerCase();
    }
}
