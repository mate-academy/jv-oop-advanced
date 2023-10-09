package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(5);
        switch (choice) {
            case 0:
                int squareSide = random.nextInt(10) + 1;
                return new Square(squareSide, colorSupplier.getRandomColor());
            case 1:
                int rectLength = random.nextInt(10) + 1;
                int rectWidth = random.nextInt(10) + 1;
                return new Rectangle(rectLength, rectWidth, colorSupplier.getRandomColor());
            case 2:
                int triFirstLeg = random.nextInt(10) + 1;
                int triSecondLeg = random.nextInt(10) + 1;
                return new RightTriangle(triFirstLeg, triSecondLeg, colorSupplier.getRandomColor());
            case 3:
                int circleRadius = random.nextInt(10) + 1;
                return new Circle(circleRadius, colorSupplier.getRandomColor());
            case 4:
                int trapezoidUpperBase = random.nextInt(10) + 1;
                int trapezoidLowerBase = random.nextInt(10) + 1;
                int trapezoidHeight = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(trapezoidUpperBase, trapezoidLowerBase,
                        trapezoidHeight, colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
