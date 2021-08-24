package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 5; // range for random values generator
    private final Random random = new Random(); // random int values generator for color select
    private final String [] colors = new String[COLOR_COUNT]; // array of possible figure colors

    // constructor for  array possible figures colors ColorSupplier initialize
    public ColorSupplier() {
        this.colors[0] = "black";
        this.colors[1] = "white";
        this.colors[2] = "red";
        this.colors[3] = "green";
        this.colors[4] = "yellow";
    }

    // get random color of possible values
    public String getRandomColor() {
        return colors[random.nextInt(COLOR_COUNT)];
    }
}
