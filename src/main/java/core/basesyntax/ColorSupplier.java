package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"red", "blue", "green", "yellow", "purple", "orange"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
