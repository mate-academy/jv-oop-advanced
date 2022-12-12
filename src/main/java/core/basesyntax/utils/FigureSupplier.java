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
    private static final int FIGURES_NUMBER = 4;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (randomNumber(FIGURES_NUMBER)) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), randomNumber(MAX_NUMBER_FOR_SIDES));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier
                .getRandomColor(), randomNumber(MAX_NUMBER_FOR_SIDES),
                randomNumber(MAX_NUMBER_FOR_SIDES) + 2, randomNumber(MAX_NUMBER_FOR_SIDES));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), randomNumber(MAX_NUMBER_FOR_SIDES),
                randomNumber(MAX_NUMBER_FOR_SIDES));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), randomNumber(MAX_NUMBER_FOR_SIDES),
                randomNumber(MAX_NUMBER_FOR_SIDES));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), randomNumber(MAX_NUMBER_FOR_SIDES));
    }

    private int randomNumber(int number) {
        return random.nextInt(number + MIN_NUMBER_FOR_SIDES);
    }
}
