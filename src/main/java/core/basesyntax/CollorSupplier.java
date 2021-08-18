package core.basesyntax;

import java.util.Random;

public interface CollorSupplier {
    String [] colors = new String[] {"red", "blue", "white", "black", "green"};

    default String getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
