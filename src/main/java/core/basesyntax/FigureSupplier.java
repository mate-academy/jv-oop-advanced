package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_VALUE = 5;

    private static final int VALUE = 10;

    private final Random random = new Random();

    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), VALUE);
    }
}
