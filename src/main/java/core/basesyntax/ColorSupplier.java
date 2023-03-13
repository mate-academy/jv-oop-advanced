package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private String[] colors = new String[] {"Red", "Green", "Blue", "White"};

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
