package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    protected Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
