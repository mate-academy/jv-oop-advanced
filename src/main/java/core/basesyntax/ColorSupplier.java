package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"red", "green", "blue", "yellow", "purple", "orange"};
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
