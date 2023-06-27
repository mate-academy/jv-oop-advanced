package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.services.Color;
import core.basesyntax.services.Shape;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 20;
    private static final Random RANDOM = new Random();
    private static final int CONSTANT_RADIUS = 10;

    public Figure getRandomFigure() {
        int numberOfShapes = Shape.values().length;
        int randomShapeNumber = RANDOM.nextInt(numberOfShapes);
        Shape shape = Shape.values()[randomShapeNumber];
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Figure figure = null;
        int randomFigureSize = RANDOM.nextInt(MAX);
        switch (shape) {
            case SQUARE:
                figure = new Square(randomFigureSize, color);
                break;
            case RECTANGLE:
                figure = new Rectangle(randomFigureSize, randomFigureSize, color);
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(randomFigureSize, randomFigureSize, color);
                break;
            case CIRCLE:
                figure = new Circle(randomFigureSize, color);
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(randomFigureSize, randomFigureSize,
                        randomFigureSize, color);
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(CONSTANT_RADIUS, Color.WHITE.name());
    }
}
