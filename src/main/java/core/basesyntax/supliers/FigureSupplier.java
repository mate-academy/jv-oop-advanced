package core.basesyntax.supliers;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final int maxValue = 50;
    private final String defaultColor = "White";
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
        return new Circle(10, defaultColor);
    }

    private double getRandomSize() {
        return Math.round(random.nextDouble() * maxValue * 10.0) / 10.0;
    }
}
