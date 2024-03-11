package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"blue", "red", "green", "yellow", "orange"};
        return colors[new Random().nextInt(colors.length)];
    }
}
