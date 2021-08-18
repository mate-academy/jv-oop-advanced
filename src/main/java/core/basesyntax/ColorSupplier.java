package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] color = new String[]{"Green", "Blue", "Brown", "Red"};
        Random random = new Random();
        return color[random.nextInt(color.length)];
    }
}
