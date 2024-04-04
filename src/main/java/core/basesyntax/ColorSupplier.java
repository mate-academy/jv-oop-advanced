package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    static final Random RANDOM = new Random();

    public String getRandomColor() {
        int index = RANDOM.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }

}
