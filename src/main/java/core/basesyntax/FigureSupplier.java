package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();
    public static final int boundNumber = 25;
    public static final String defaultColor = Color.WHITE.name();
    public static final int defaultRadius = 10;
    public static final int figureNumber = 5;

    public Figure getRandomFigure() {
        int number = random.nextInt(figureNumber);
        switch (number) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }

    private Figure getRandomCircle() {
        return new Circle(
                supplier.getRandomColor(),
                random.nextInt(boundNumber)
        );
    }

    private Figure getRandomSquare() {
        return new Square(
                supplier.getRandomColor(),
                random.nextInt(boundNumber)
        );
    }

    private Figure getRandomRectangle() {
        return new Rectangle(
                supplier.getRandomColor(),
                random.nextInt(boundNumber),
                random.nextInt(boundNumber)
        );
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(
                supplier.getRandomColor(),
                random.nextInt(boundNumber),
                random.nextInt(boundNumber)
        );
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                supplier.getRandomColor(),
                random.nextInt(boundNumber),
                random.nextInt(boundNumber),
                random.nextInt(boundNumber)
        );
    }
}
