package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"red", "green", "blue", "yellow", "orange", "purple"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
