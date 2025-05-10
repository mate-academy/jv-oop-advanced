package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0: return getRandomSquare();
            case 1: return getRandomRectangle();
            case 2: return getRandomCircle();
            case 3: return getRandomRightTriangle();
            case 4: return getIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        final String defaultName = "Circle";
        final String defaultColor = "White";
        final int defaultRadius = 10;
        return new Circle(defaultColor, defaultName, defaultRadius);
    }

    public Figure getRandomSquare() {
        String squareColor = colorSupplier.getRandomColor();
        String squareName = "Square";
        int side = random.nextInt(1000);
        return new Square(squareColor, squareName, side);
    }

    public Figure getRandomRectangle() {
        String rectangleName = "Rectangle";
        int sideA = random.nextInt(1000);
        int sideB = random.nextInt(1000);
        String rectangleColor = colorSupplier.getRandomColor();
        return new Rectangle(rectangleColor, rectangleName, sideA, sideB);
    }

    public Figure getRandomCircle() {
        String circleName = "Circle";
        String circleColor = colorSupplier.getRandomColor();
        int circleRadius = random.nextInt(1000);
        return new Circle(circleColor, circleName, circleRadius);
    }

    public Figure getRandomRightTriangle() {
        String rightTriangleName = "Right Triangle";
        String rightTriangleColor = colorSupplier.getRandomColor();
        int rightTriangleBase = random.nextInt(1000);
        int rightTriangleLeg = random.nextInt(1000);
        return new RightTriangle(rightTriangleColor, rightTriangleName,
                rightTriangleLeg, rightTriangleBase);
    }

    public Figure getIsoscelesTrapezoid() {
        String isoscelesTrapezoidName = "Isosceles Trapezoid";
        String isoscelesTrapezoidColor = colorSupplier.getRandomColor();
        int isoscelesTrapezoidLowerBase = random.nextInt(1000);
        int isoscelesTrapezoidUpperBase = random.nextInt(1000);
        int isoscelesTrapezoidHeight = random.nextInt(1000);
        return new IsoscelesTrapezoid(isoscelesTrapezoidColor,
                isoscelesTrapezoidName, isoscelesTrapezoidLowerBase,
                isoscelesTrapezoidUpperBase, isoscelesTrapezoidHeight);
    }
}
