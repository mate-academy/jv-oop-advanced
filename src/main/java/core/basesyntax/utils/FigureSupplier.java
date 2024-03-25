package core.basesyntax.utils;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure(ColorSupplier colorSupplier) {
        FigureType randomFigureType = getRandomFigureType();

        switch (randomFigureType) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getRandomNumber());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private double getRandomNumber() {
        return Math.round(random.nextDouble() * 10 + 1);
    }

    private FigureType getRandomFigureType() {
        FigureType[] types = FigureType.values();
        int randomIndex = random.nextInt(types.length);
        return types[randomIndex];
    }
}
