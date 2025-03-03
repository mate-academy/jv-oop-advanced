package core.basesyntax.supliers;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = new String[] {"red", "blue", "green", "yellow", "orange"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
