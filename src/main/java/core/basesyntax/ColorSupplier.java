package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"yellow", "brown", "blue", "red", "white", "black", "green"};

    public String getRandomColor() {
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex];
    }
}

