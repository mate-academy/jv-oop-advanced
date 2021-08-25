package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 5;
    private final Random random = new Random();
    private final String [] colors = new String[COLOR_COUNT];

    public ColorSupplier() {
        this.colors[0] = "black";
        this.colors[1] = "white";
        this.colors[2] = "red";
        this.colors[3] = "green";
        this.colors[4] = "yellow";
    }

    public String getRandomColor() {
        return colors[random.nextInt(COLOR_COUNT)];
    }
}
