package service;

import base.Figure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";

    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        double randomNum = random.nextDouble() * 10 + 1;
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color,randomNum);
            case 1:
                return new Square(color,randomNum);
            case 2:
                return new Rectangle(color,randomNum, randomNum);
            case 3:
                return new RightTriangle(color, randomNum, randomNum);
            case 4:
                return new IsoscelesTrapezoid(color, randomNum, randomNum, randomNum);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
