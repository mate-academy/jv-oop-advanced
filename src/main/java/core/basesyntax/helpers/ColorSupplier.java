package core.basesyntax.helpers;

import core.basesyntax.enums.Colors;
import core.basesyntax.interfaces.RandomNumber;
import core.basesyntax.models.Figure;

public class ColorSupplier implements RandomNumber {
    private static final Colors[] COLORS = Colors.values();

    public String getRandomColor() {
        int randomIndex = getRandomNumber(Figure.RANDOM, COLORS.length);
        return COLORS[randomIndex].name();
    }
}
