package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int CASE_INDEX = 5;
    public static final Color DEFAULT_COLOR = Color.WHITE;

    private static final double DEFAULT_RADIUS = 10.0;

    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(CASE_INDEX);
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure figure;

        switch (index) {
            case 0: {
                figure = new Circle(random.nextDouble() * 100.0,
                        colorSupplier.getRandomColor(), "Circle");
                break;
            }
            case 1: {
                figure = new IsoscelesTrapezoid(random.nextDouble(10.0,20.0),
                        random.nextDouble(10.0,20.0),random.nextDouble(15.0, 30.0),
                        colorSupplier.getRandomColor(), "IsoscelesTrapezoid");
                break;
            }
            case 2: {
                figure = new Rectangle(random.nextDouble(50.0), random.nextDouble(50.0),
                        colorSupplier.getRandomColor(), "Rectangle");
                break;
            }
            case 3: {
                figure = new RightTriangle(random.nextDouble(30.0), colorSupplier.getRandomColor(),
                        "RightTriangle");
                break;
            }
            case 4: {
                figure = new Square(random.nextDouble(30.0),
                        colorSupplier.getRandomColor(), "Square");
                break;
            }
            default: {
                throw new IllegalArgumentException("Unexpected value for CASE_INDEX: " + index);
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR, "Circle");
    }
}
