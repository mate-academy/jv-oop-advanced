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
                return new Square();
            case 1:
                return new Rectangle();
            case 2:
                return new RightTriangle();
            case 3:
                return new Circle();
            case 4:
                return new IsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }
    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle();
        defaultCircle.setCircle(DEFAULT_COLOR, DEFAULT_RADIUS);
        return defaultCircle;
        }
    }
