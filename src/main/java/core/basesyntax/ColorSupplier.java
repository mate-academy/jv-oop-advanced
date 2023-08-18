package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private String color;

    private String[] colors = {"blue", "yellow", "green", "grey", "black", "purple"};

    private Random random = new Random();

    public String getColor() {
        return color;
    }

    public String getRandomColor() {
        int getIndex = random.nextInt(colors.length);
        return colors[getIndex];
    }
}
