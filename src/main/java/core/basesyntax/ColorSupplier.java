package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getColor() {
        Random random = new Random();
        String[] colors = { "Blue", "Green", "Red", "Brown",
                "Black" };
        int color = random.nextInt(colors.length);
        String randomColor = "";
        for (int i = 0; i < colors.length; i++) {
            if (i == color) {
                randomColor += colors[i];
            }
        }
        return randomColor;
    }
}
