package core.basesyntax.supliers;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 50;
    private static final String DEFAULT_COLOR = "White";
    private static final double DEFAULT_NUMBER = 10.0;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        switch (random.nextInt(5)) {
            case 0:
                return new Circle(getRandomSize(), color);
            case 1:
                return new Square(getRandomSize(), color);
            case 2:
                return new Rectangle(getRandomSize(), getRandomSize(), color);
            case 3:
                return new RightTriangle(getRandomSize(), getRandomSize(), color);
            case 4:
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_NUMBER, DEFAULT_COLOR);
    }

    private double getRandomSize() {
        return Math.round(random.nextDouble() * MAX_VALUE * DEFAULT_NUMBER) / DEFAULT_NUMBER;
    }
}
