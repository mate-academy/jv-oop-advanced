package core.basesyntax.supplier;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.service.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 6;
    private static final int VALUE = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), VALUE);
    }
}
