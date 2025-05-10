package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double RADIUS = 10;
    public static final String COLOR = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (FigureList.values()[random.nextInt(FIGURE_COUNT)]) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomRightTriangle();
        }
    }

    private Figure getRandomCircle() {
        double radius = random.nextInt(random.nextInt(100) + 1);
        return new Circle(radius, colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        double side = random.nextInt(random.nextInt(100) + 1);
        return new Square(side, colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        double length = random.nextInt(random.nextInt(100) + 1);
        double width = random.nextInt(random.nextInt(100) + 1);
        return new Rectangle(length, width, colorSupplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        double sideA = random.nextInt(random.nextInt(100) + 1);
        double sideB = random.nextInt(random.nextInt(100) + 1);
        double height = random.nextInt(random.nextInt(100) + 1);
        return new IsoscelesTrapezoid(sideA, sideB, height, colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        double firstLeg = random.nextInt(random.nextInt(100) + 1);
        double secondLeg = random.nextInt(random.nextInt(100) + 1);
        return new RightTriangle(firstLeg, secondLeg, colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS, COLOR);
    }
}
