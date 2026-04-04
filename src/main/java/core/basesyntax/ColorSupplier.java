package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        String[] colors = {"green", "red", "yellow", "white", "blue", "black"};
        return colors[new Random().nextInt(colors.length)];
    }
}
