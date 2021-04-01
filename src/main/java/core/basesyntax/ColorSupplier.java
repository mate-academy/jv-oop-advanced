package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String generateColor() {
        Random random = new Random();
        final String[] colors = new String[]{"red", "blue", "green",
                "white", "yellow", "orange", "purple"};

        return colors[random.nextInt(colors.length)];
    }
}
