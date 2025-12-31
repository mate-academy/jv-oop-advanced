package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private String[] color = new String[] {"blue", "red", "yellow", "orange", "white"};

    private int index = new Random().nextInt(color.length);

    public String getRandomColor() {
        return color[index];
    }
}
