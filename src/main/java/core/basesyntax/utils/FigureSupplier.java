package core.basesyntax.utils;

import core.basesyntax.geometry.Color;
import core.basesyntax.geometry.Figure;
import core.basesyntax.geometry.figures.Circle;
import core.basesyntax.geometry.figures.IsoscelesTrapezoid;
import core.basesyntax.geometry.figures.Rectangle;
import core.basesyntax.geometry.figures.RightTriangle;
import core.basesyntax.geometry.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private static final int MAX_NUMBER_FOR_SIDES = 10;
    private static final int MIN_NUMBER_FOR_SIDES = 1;
    private static final int FIGURES_NUMBER = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int side = random.nextInt(MAX_NUMBER_FOR_SIDES + MIN_NUMBER_FOR_SIDES);

    public Figure getRandomFigure() {
        int figure = random.nextInt(FIGURES_NUMBER);
        switch (figure) {
            case 0: return getRandomCircle();
            case 1: return getRandomIsoscelesTrapezoid();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            default: return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), side);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier
                .getRandomColor(), side, side + 2, side);
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), side, side);
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), side, side);
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), side);
    }
}
