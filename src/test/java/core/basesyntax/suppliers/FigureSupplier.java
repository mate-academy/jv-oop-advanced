package core.basesyntax.suppliers;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.figures.*;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Square("SQUARE",new ColorSupplier().getRandomColor(), random.nextInt());
            case 1:
                return new Rectangle("RECTANGLE", new ColorSupplier().getRandomColor(), random.nextInt(), random.nextInt());
            case 2:
                return new RightTriangle("RIGHT TRIANGLE", new ColorSupplier().getRandomColor(), random.nextInt());
            case 3:
                return new Circle("CIRCLE", new ColorSupplier().getRandomColor(), random.nextInt());
            case 4:
                return new IsoscelesTrapezoid("ISOSCELES TRAPEZOID", new ColorSupplier().getRandomColor(), random.nextInt(), random.nextInt(), random.nextDouble());
            default:
                return getDefaultFigure();
        }
    }
    public Figure getDefaultFigure() {
        return new Circle("CIRCLE", DEFAULT_COLOR, DEFAULT_RADIUS);
        }
    }
