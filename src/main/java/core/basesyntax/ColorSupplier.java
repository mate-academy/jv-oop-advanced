package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"Red", "Yellow", "Green", "Blue", "Purple"};

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
