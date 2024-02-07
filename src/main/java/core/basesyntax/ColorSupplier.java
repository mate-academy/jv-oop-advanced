package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        int randomInt = random.nextInt(colors.length);
        return colors[randomInt].name().toLowerCase();
    }
}
