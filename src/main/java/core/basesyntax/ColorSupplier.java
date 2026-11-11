package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"red", "blue", "green", "yellow", "black", "white"};

    public String getRandomColor() {
        Random random = new Random();
        int number = random.nextInt(0, colors.length);
        return colors[number];
    }

}
