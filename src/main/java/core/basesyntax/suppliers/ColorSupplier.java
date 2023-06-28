package core.basesyntax.suppliers;

import core.basesyntax.colors.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int randomNumber = random.nextInt(colors.length);
        Color randomColor = colors[randomNumber];
        return randomColor.name();
    }
}
