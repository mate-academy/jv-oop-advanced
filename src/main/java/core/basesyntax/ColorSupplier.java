package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final String[] colors = {"red", "blue", "green",
            "yellow", "purple", "orange"};

    public String getRandomColor() {

        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
