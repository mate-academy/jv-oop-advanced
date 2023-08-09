package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    enum Color { WHITE, BLACK, RED, BLUE, GREEN }

    private Random random = new Random();

    public String gerRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
