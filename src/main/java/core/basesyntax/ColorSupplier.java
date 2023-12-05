package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        String[] colors = {"red", "white", "blue", "green", "orange"};
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
