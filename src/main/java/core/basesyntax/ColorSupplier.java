package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class ColorSupplier {
    private final String[] colors = new String[]{
            "blue", "red", "yellow", "green", "purple", "black", "white"
    };

    public String getRandomColor() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, colors.length);
        return colors[randomIndex];
    }
}
