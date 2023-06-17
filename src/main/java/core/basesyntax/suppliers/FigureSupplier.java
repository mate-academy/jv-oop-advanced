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

    public Figure getRandomFigure() {
        Shape shape = Shape.values()[new Random().nextInt(Shape.values().length)];
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Figure figure = null;
        switch (shape) {
            case SQUARE:
                int side = new Random().nextInt(MAX);
                figure = new Square(side, color);
                break;
            case RECTANGLE:
                int width = new Random().nextInt(MAX);
                int height = new Random().nextInt(MAX);
                figure = new Rectangle(width, height, color);
                break;
            case RIGHT_TRIANGLE:
                int firstLeg = new Random().nextInt(MAX);
                int secondLeg = new Random().nextInt(MAX);
                figure = new RightTriangle(firstLeg, secondLeg, color);
                break;
            case CIRCLE:
                int radius = new Random().nextInt(MAX);
                figure = new Circle(radius, color);
                break;
            case ISOSCELES_TRAPEZOID:
                int topSide = new Random().nextInt(MAX);
                int bottomSide = new Random().nextInt(MAX);
                int height1 = new Random().nextInt(MAX);
                figure = new IsoscelesTrapezoid(height1, topSide, bottomSide, color);
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
