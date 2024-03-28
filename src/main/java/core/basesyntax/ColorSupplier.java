package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_VALUE = Color.values().length;

    public String getColorOfFigure() {
        final int indexOfColor = new Random().nextInt(MAX_VALUE);
        final Color colorOfFigure = Color.values()[indexOfColor];
        return colorOfFigure.name();
    }
}
