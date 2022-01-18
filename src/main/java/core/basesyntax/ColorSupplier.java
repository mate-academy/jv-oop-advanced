package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"red", "blue", "white", "black", "pink", "grey"};

    public String getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
