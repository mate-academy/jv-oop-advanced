package core.basesyntax.service;

import core.basesyntax.Figure;
import core.basesyntax.model.Circle;
import core.basesyntax.model.Colors;
import core.basesyntax.model.FigureType;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int value = random.nextInt(10);
        FigureType randomFigureType = FigureType.values()[figureNumber];
        switch (randomFigureType) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), value);
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), value);
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), value, value);
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), value, value);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), value, value, value);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10);
    }

}
