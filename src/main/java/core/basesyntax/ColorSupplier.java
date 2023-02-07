package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static final Random RANDOM = new Random();

    private String[] colors = {"white", "black", "green", "navy",
            "yellow", "red", "purple", "orange"};

    public String getRandomColor() {
        return colors[RANDOM.nextInt(colors.length)];
    }

    public String[] getColors() {
        return colors;
    }
}
