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
    private static final int CONSTANT_RADIUS = 10;
    private final Random randomGenerator = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfShapes = Shape.values().length;
        int randomShapeNumber = randomGenerator.nextInt(numberOfShapes);
        Shape shape = Shape.values()[randomShapeNumber];
        String color = colorSupplier.getRandomColor();
        Figure figure = null;
        switch (shape) {
            case SQUARE:
                figure = new Square(randomGenerator.nextInt(MAX), color);
                break;
            case RECTANGLE:
                figure = new Rectangle(randomGenerator.nextInt(MAX), randomGenerator.nextInt(MAX),
                        color);
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(randomGenerator.nextInt(MAX),
                        randomGenerator.nextInt(MAX), color);
                break;
            case CIRCLE:
                figure = new Circle(randomGenerator.nextInt(MAX), color);
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(randomGenerator.nextInt(MAX),
                        randomGenerator.nextInt(MAX), randomGenerator.nextInt(MAX), color);
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
