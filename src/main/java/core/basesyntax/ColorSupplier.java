package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(ColorList.values().length + 1);
        return ColorList.values()[index].name();
    }
}
