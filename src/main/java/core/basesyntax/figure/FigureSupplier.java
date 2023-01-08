package core.basesyntax.figure;

import core.basesyntax.figure.color.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_NUMBER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private String color;

    private Figure getCircle() {
        int radius = random.nextInt(BOUND_NUMBER);
        return new Circle(color, radius);
    }

    private Figure getSquare() {
        int side = random.nextInt(BOUND_NUMBER);
        return new Square(color, side);
    }

    private Figure getRightTriangle() {
        int firstLeg = random.nextInt(BOUND_NUMBER);
        int secondLeg = random.nextInt(BOUND_NUMBER);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRectangle() {
        int sideA = random.nextInt(BOUND_NUMBER);
        int sideB = random.nextInt(BOUND_NUMBER);
        return new Rectangle(color, sideA, sideB);
    }

    private Figure getIsoscelesTrapezoid() {
        int upperSide = random.nextInt(BOUND_NUMBER);
        int downSide = random.nextInt(BOUND_NUMBER);
        int height = random.nextInt(BOUND_NUMBER);
        return new IsoscelesTrapezoid(color, upperSide, downSide, height);
    }

    public Figure getRandomFigure(String nameFigure) {
        color = colorSupplier.getRandomColor();
        switch (nameFigure) {
            case "SQUARE":
                return getSquare();
            case "TRIANGLE":
                return getRightTriangle();
            case "RECTANGLE":
                return getRectangle();
            case "CIRCLE":
                return getCircle();
            case "TRAPEZOID":
                return getIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
