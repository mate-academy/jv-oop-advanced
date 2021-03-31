package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String randomColor() {
        String[] colors = { "red", "blue", "black", "gray", "pink", "yellow", "violet", "purple",
                "brown", "gold", "white", "silver", "orange", "transparent" };
        return colors[random.nextInt(colors.length)];
    }
}
