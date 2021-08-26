package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colorsArray = new String[]{
            "red",
            "blue",
            "black",
            "white",
            "yellow"
    };
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        return colorsArray[random.nextInt(colorsArray.length)];
    }
}
