package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = new String[]{"blue", "yeLlo", "red", "purple", "green"};
    private Random random = new Random();

    public String setColor() {
        int number = random.nextInt(colors.length);
        return colors[number];
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
