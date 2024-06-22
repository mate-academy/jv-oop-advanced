package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                double trapezoidHeight = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(color, firstLeg, secondLeg, trapezoidHeight);
            case 1:
                double sideLength = random.nextDouble() * 10 + 1;
                return new Square(color, sideLength);
            case 2:
                double weight = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new Rectangle(color, weight, height);
            case 3:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(color, radius);
            case 4:
                double base = random.nextDouble() * 10 + 1;
                double triangleHeight = random.nextDouble() * 10 + 1;
                return new RightTriangle(color, base, triangleHeight);
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
