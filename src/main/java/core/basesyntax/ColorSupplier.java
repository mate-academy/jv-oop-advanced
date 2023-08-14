package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomIndexColor = new Random();

    public String getRandomColor() {
        int index = randomIndexColor.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
