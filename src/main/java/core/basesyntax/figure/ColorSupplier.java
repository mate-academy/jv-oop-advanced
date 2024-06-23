package core.basesyntax.figure;

import java.util.Random;

public class ColorSupplier {

    private static final String[] COLORS = {
            "red",
            "blue",
            "green",
            "yellow",
            "black",
            "white",
            "purple",
            "gray"
    };

    public String getRandomColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
