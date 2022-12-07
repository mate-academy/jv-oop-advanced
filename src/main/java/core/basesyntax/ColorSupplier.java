package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String[] colors = new String[]{"Yellow", "Blue", "Red", "Green","White"};
    Random random = new Random();
    public String getRandomColor() {
        return colors[random.nextInt(colors.length - 1)];
    }
}
