package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = new String[] {"red", "blue", "green", "yellow", "white"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
