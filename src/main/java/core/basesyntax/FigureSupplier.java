package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Figure figure;
        GeometricFigure geometricFigure = new GeometricFigureSupplier().getRandomFigure();
        int random = new Random().nextInt(1, 100);
        String colorSupplier = new ColorSupplier().getRandomColor().toLowerCase();
        switch (geometricFigure) {
            case CIRCLE:
                figure = new Circle(random, colorSupplier);
                break;
            case RECTANGLE:
                figure = new Rectangle(random, random, colorSupplier);
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(random, random, random, colorSupplier);
                break;
            case SQUARE:
                figure = new Square(random, colorSupplier);
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(random, random, colorSupplier);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + geometricFigure);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Color color = Color.WHITE;
        return new Circle(10, color.name().toLowerCase());
    }
}
