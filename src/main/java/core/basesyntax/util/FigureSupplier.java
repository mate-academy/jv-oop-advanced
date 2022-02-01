package core.basesyntax.util;

import core.basesyntax.entity.Circle;
import core.basesyntax.entity.Color;
import core.basesyntax.entity.Figure;
import core.basesyntax.entity.Square;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, colorSupplier.getDefaultColor());
    }

}
