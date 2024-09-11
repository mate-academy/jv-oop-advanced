package service;

import base.Color;
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
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();

    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private double getRandomSide() {
        return random.nextDouble() * 10 + 1;
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color, getRandomSide());
            case 1:
                return new Square(color, getRandomSide());
            case 2:
                return new Rectangle(color, getRandomSide(), getRandomSide());
            case 3:
                return new RightTriangle(color, getRandomSide(), getRandomSide());
            case 4:
                return new IsoscelesTrapezoid(color,
                        getRandomSide(),
                        getRandomSide(),
                        getRandomSide());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
