package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"red", "grey", "blue", "white", "yellow", "black",
            "funny", "the jeltui", "oranjevui", "sinhrofazotron"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
