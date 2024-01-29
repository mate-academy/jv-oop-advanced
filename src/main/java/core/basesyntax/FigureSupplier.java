package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private static final int QUANITY_OF_TYPES = 5;
    private static final int CONSTANT = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(QUANITY_OF_TYPES);
        switch (figureType) {
            case 0:
                return preparedCirce();
            case 1:
                return preparedTrapezoid();
            case 2:
                return preparedRectangle();
            case 3:
                return preparedTriangle();
            case 4:
                return preparedSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomDouble() {
        return (double) Math.round(random.nextDouble() * CONSTANT) / CONSTANT;
    }

    private RightTriangle preparedTriangle() {
        return new RightTriangle(
                colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble());
    }

    private Square preparedSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomDouble());
    }

    private Circle preparedCirce() {
        return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
    }

    private IsoscelesTrapezoid preparedTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Rectangle preparedRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble());
    }
}
