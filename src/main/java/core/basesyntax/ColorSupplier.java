package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getColor() {
        Random random = new Random();
        String[] colors = { "Blue", "Green", "Red", "Brown",
                "Black" };
        return colors[random.nextInt(colors.length)];
    }
}
