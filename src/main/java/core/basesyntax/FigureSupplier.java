package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return prepareSquare();
            case 1:
                return prepareRectangle();
            case 2:
                return prepareRightTriangle();
            case 3:
                return prepareCircle();
            case 4:
                return prepareIsoscelesTrapezoid();
            default:
                throw new IllegalStateException();
        }
    }

    private static Square prepareSquare() {
        double side = random.nextInt(10) + 1;
        Color color = ColorSupplier.getRandomColor();
        return new Square(side, color);
    }

    private static Rectangle prepareRectangle() {
        double width = random.nextInt(10) + 1;
        double height = random.nextInt(10) + 1;
        Color color = ColorSupplier.getRandomColor();
        return new Rectangle(width, height, color);
    }

    private static RightTriangle prepareRightTriangle() {
        double firstLeg = random.nextInt(10) + 1;
        double secondLeg = random.nextInt(10) + 1;
        Color color = ColorSupplier.getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private static Circle prepareCircle() {
        double radius = random.nextInt(10) + 1;
        Color color = ColorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private static IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        double upperBase = random.nextInt(10) + 1;
        double lowerBase = random.nextInt(10) + 1;
        double height = random.nextInt(10) + 1;
        Color color = ColorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(upperBase, lowerBase, height, color);
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
