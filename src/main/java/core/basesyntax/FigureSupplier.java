package core.basesyntax;

import core.basesyntax.model.*;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 4;
    private static final int MAX_VALUE_FOR_RANDOM_FIGURE = 50;
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURE_AMOUNT);
        return new Figure[]{getRandomCircle(), getRandomRectangle(), getRandomIsoscelesTrapezoid(),
                getRandomRightRectangle()}[randomIndex];
    }

    private Figure getRandomCircle() {
        return new Circle(ColorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(ColorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE));
    }

    private Figure getRandomRightRectangle() {
        return new RightTriangle(ColorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE),
                random.nextInt(MAX_VALUE_FOR_RANDOM_FIGURE));
    }
}
