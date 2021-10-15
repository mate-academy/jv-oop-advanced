package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();
    private String[] colors = {"blue", "green", "magenta", "red", "yellow"};

    public String getRandomColor() {
        int pos = random.nextInt(colors.length);
        return colors[pos];
    }
}
