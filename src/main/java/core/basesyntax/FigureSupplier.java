package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String color = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        return switch (figureType) {
            case 0 -> getIsoscelesTrapezoid();
            case 1 -> getSquare();
            case 2 -> getRectangle();
            case 3 -> getCircle();
            default -> getRightTriangle();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private Figure getIsoscelesTrapezoid() {
        double firstLeg = random.nextDouble() * 10 + 1;
        double secondLeg = random.nextDouble() * 10 + 1;
        double trapezoidHeight = random.nextDouble() * 10 + 1;
        return new IsoscelesTrapezoid(color, firstLeg, secondLeg, trapezoidHeight);
    }

    private Figure getSquare() {
        double sideLength = random.nextDouble() * 10 + 1;
        return new Square(color, sideLength);
    }

    private Figure getRectangle() {
        double weight = random.nextDouble() * 10 + 1;
        double height = random.nextDouble() * 10 + 1;
        return new Rectangle(color, weight, height);
    }

    private Figure getCircle() {
        double radius = random.nextDouble() * 10 + 1;
        return new Circle(color, radius);
    }

    private Figure getRightTriangle() {
        double base = random.nextDouble() * 10 + 1;
        double triangleHeight = random.nextDouble() * 10 + 1;
        return new RightTriangle(color, base, triangleHeight);
    }
}
