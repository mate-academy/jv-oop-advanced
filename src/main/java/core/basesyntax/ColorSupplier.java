package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = new String[] {"blue", "red", "green", "ginger", "purple"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
