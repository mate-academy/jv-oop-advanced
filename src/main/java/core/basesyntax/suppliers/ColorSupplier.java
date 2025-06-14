package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] colors = {Colors.BLACK, Colors.BLUE, Colors.BROWN, Colors.GREEN,
            Colors.RED, Colors.WHITE, Colors.YELLOW};

    @Override
    public String toString() {
        return "default";
    }

    public String getRandomColor() {
        return (colors[new Random().nextInt(colors.length)].toString());
    }

    private enum Colors {
        BLACK,
        BLUE,
        BROWN,
        GREEN,
        RED,
        WHITE,
        YELLOW
    }
}
