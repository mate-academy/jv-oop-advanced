package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN = 1;
    private static final int MAX = 20;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure () {
        int type = random.nextInt(5);
        String color = String.valueOf(randomColor.getRandomColor());
        switch (type) {
            case 0:
                double rectangleSideA = random.nextInt(MIN, MAX);
                double rectangleSideB = random.nextInt(MIN, MAX);
                return new Rectangle(rectangleSideA, rectangleSideB, color);
            case 1:
                double squareSide = random.nextInt(MIN, MAX);
                return new Square(squareSide, color);
            case 2:
                double isoscelesTrapezoidSideA = random.nextInt(MIN, MAX);
                double isoscelesTrapezoidSideB = random.nextInt(MIN, MAX);
                double isoscelesTrapezoidHeight = random.nextInt(MIN, MAX);
                return new IsoscelesTrapezoid(isoscelesTrapezoidSideA, isoscelesTrapezoidSideB, isoscelesTrapezoidHeight, color);
            case 3:
                double rightTriangleBase = random.nextInt(MIN, MAX);
                double rightTriangleHight = random.nextInt(MIN, MAX);
                return new RightTriangle(rightTriangleBase, rightTriangleHight, color);
            case 4:
                double circleRadius = random.nextInt(MIN, MAX);
                return new Circle(circleRadius, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
