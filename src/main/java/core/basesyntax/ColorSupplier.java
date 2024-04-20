package core.basesyntax;

import java.util.Random;

public interface ColorSupplier {
    Random random = new Random();
    static String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
