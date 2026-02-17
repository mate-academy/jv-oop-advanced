package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {
                "white",
                "blue",
                "green",
                "yellow",
                "black",
                "red"
        };
        int i = ThreadLocalRandom.current().nextInt(colors.length);
        return colors[i];
    }
}
