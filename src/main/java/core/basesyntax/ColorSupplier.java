package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();
    private String[] colors = new String[]{"white", "black", "blue", "red"};

    public String getRandomColor() {
        return colors[rand.nextInt(colors.length)];
    }

    public String getDefaultColor() {
        return "white";
    }
}
