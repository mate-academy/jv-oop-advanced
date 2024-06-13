package core.basesyntax;

import static core.basesyntax.Figure.DEFAULT_COLOR;
import static core.basesyntax.Figure.DEFAULT_RADIUS;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final double DIMENSION_RANGE = 10.0;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return createSquare(color);
            case 1:
                return createRectangle(color);
            case 2:
                return createRightTriangle(color);
            case 3:
                return createCircle(color);
            default:
                return createIsoscelesTrapezoid(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure createSquare(String color) {
        double side = random.nextDouble() * DIMENSION_RANGE + 1;
        return new Square(color, side);
    }

    private Figure createRectangle(String color) {
        double length = random.nextDouble() * DIMENSION_RANGE + 1;
        double width = random.nextDouble() * DIMENSION_RANGE + 1;
        return new Rectangle(color, length, width);
    }

    private Figure createRightTriangle(String color) {
        double firstLeg = random.nextDouble() * DIMENSION_RANGE + 1;
        double secondLeg = random.nextDouble() * DIMENSION_RANGE + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createCircle(String color) {
        double radius = random.nextDouble() * DIMENSION_RANGE + 1;
        return new Circle(color, radius);
    }

    private Figure createIsoscelesTrapezoid(String color) {
        double base1 = random.nextDouble() * DIMENSION_RANGE + 1;
        double base2 = random.nextDouble() * DIMENSION_RANGE + 1;
        double height = random.nextDouble() * DIMENSION_RANGE + 1;
        return new IsoscelesTrapezoid(color, base1, base2, height);
    }
}
