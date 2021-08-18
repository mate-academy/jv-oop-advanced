package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colorS = new String[] {"red", "green", "blue", "black", "white", "purple"};

    public String getRandomColor() {
        return colorS[new Random().nextInt(colorS.length)];
    }
}
