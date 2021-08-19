package core.basesyntax;

import java.util.Random;

public class CollorSupplier {
    private final String [] colors = new String[] {"red", "blue", "white", "black", "green"};

    public String getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
