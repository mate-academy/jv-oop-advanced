package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_VALUE = Color.values().length;
    private final int indexOfColor = new Random().nextInt(MAX_VALUE);

    public String getRandomColor() {
        final Color colorOfFigure = Color.values()[indexOfColor];
        return colorOfFigure.name();
    }
}
