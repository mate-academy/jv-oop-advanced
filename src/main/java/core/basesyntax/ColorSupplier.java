package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = new String[] {"white", "black", "green", "blue", "yellow", "red"};
        return colors[new Random().nextInt(colors.length)];
    }
}
