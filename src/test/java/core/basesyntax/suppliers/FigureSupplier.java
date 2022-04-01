package core.basesyntax.suppliers;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.figures.*;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private final String colorSupplier = new ColorSupplier().getRandomColor();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Square("SQUARE", colorSupplier, random.nextInt(100));
            case 1:
                return new Rectangle("RECTANGLE", colorSupplier, random.nextInt(100), random.nextInt(100));
            case 2:
                return new RightTriangle("RIGHT TRIANGLE", colorSupplier, random.nextInt(100));
            case 3:
                return new Circle("CIRCLE", colorSupplier, random.nextInt(100));
            case 4:
                return new IsoscelesTrapezoid("ISOSCELES TRAPEZOID", colorSupplier, random.nextInt(100), random.nextInt(100), random.nextDouble(100.00));
            default:
                return getDefaultFigure();
        }
    }
    public Figure getDefaultFigure() {
        return new Circle("CIRCLE", DEFAULT_COLOR, DEFAULT_RADIUS);
        }
    }
