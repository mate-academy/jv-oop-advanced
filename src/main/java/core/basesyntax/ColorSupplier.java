package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public enum Colors {
        RED,
        BLUE,
        YELLOW,
        WHITE,
        BLACK,
        PURPLE,
        ORANGE
    }

    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}
