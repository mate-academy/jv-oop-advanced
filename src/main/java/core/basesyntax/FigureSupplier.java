package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(),
                        random.nextInt(), random.nextInt());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
