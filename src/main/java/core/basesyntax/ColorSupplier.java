package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String randomColor() {
        String[] colors = new String[] {"Yellow", "Blue", "Red", "Brown", "Black", "Green",
                "Purple"};
        Random random = new Random();
        int pos = random.nextInt(colors.length);

        return colors[pos];
    }

}
