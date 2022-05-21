package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private String[] colors = {"blue", "green", "magenta", "red", "cyan"};

    public String getRandomColor() {
        int colorIndex = random.nextInt(colors.length);
        return colors[colorIndex];
    }
}
