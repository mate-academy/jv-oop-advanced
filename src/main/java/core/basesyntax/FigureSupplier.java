package core.basesyntax;

import core.basesyntax.color.ColorSupplier;
import core.basesyntax.figure.*;

import java.util.Random;

public class FigureSupplier {
    private static final String defaultColor = "white";
    private static final int defaultSize = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int maxValue = 5;

    public Figure getRandomFigure() {
        int figureType = random.nextInt(maxValue);
        String color = String.valueOf(colorSupplier.getRandomColor());
        double randomSide = random.nextDouble() * 10;

        switch (figureType) {
            case 0:
                return new Square(color, randomSide);
            case 1:
                return new Rectangle(color, randomSide, randomSide);
            case 2:
                return new RightTriangle(color, randomSide, randomSide);
            case 3:
                return new Circle(color, randomSide);
            case 4:
                return new IsoscelesTrapezoid(color, randomSide, randomSide, randomSide);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultSize);
    }
}
