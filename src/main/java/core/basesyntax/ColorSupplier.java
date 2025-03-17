package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    String[] colors = {"red", "blue", "green", "purple", "white", "black"};

    public String getRandomColor() {
        int rnd = new Random().nextInt(colors.length);
        return colors[rnd];
    }
}
