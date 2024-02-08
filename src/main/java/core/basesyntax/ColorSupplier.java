package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"red", "blue", "green", "yellow", "orange"};
    private Random random = new Random();

    public String getRandomColor() {

        return colors[random.nextInt(colors.length)];
    }
}
