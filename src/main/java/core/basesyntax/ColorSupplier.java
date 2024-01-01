package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length + 1);
        return Color.values()[index].name();
    }
}
