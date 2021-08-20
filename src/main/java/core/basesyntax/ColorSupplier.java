package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomColor = new Random();
    private String[] colors = new String[]{"red", "green", "blue", "yellow"};

    public String getRandomColor() {
        return colors[randomColor.nextInt(3)];
    }
}
