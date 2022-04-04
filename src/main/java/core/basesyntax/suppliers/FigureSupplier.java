package core.basesyntax.suppliers;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.figures.Circle;
import core.basesyntax.figure.figures.IsoscelesTrapezoid;
import core.basesyntax.figure.figures.Rectangle;
import core.basesyntax.figure.figures.RightTriangle;
import core.basesyntax.figure.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final String colorSupplier = new ColorSupplier().getRandomColor();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Square("Square",
                        colorSupplier,
                        random.nextInt(100));
            case 1:
                return new Rectangle("Rectangle",
                        colorSupplier,
                        random.nextInt(100),
                        random.nextInt(100));
            case 2:
                return new RightTriangle("RightTriangle",
                        colorSupplier,
                        random.nextInt(100));
            case 3:
                return new IsoscelesTrapezoid("Isosceles Trapezoid",
                        colorSupplier,
                        random.nextInt(100),
                        random.nextInt(100),
                        random.nextDouble(100.00));
            case 4:
                return new Circle("Circle",
                        colorSupplier,
                        random.nextInt(100));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("CIRCLE", DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
