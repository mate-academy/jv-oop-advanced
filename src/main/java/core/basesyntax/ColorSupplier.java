package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public enum Colors {
        RED,
        BLUE,
        GREEN,
        YELLOW,
        PURPLE,
        ORANGE,
    }

    public String getRandomColor() {

        Random random = new Random();
        int index = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
