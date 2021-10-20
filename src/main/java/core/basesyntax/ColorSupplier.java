package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();

    public String getRandomColor() {
        String[] colors = {"blue", "green", "magenta", "red", "yellow"};
        int pos = random.nextInt(colors.length);

        return colors[pos];
    }
}
