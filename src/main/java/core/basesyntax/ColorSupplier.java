package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random randomizer = new Random();

    public String getRandomColor() {
        Colors[] color = Colors.values();
        return color[randomizer.nextInt(color.length)].name();
    }

}
