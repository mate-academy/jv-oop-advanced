package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureCount = random.nextInt(FIGURE_COUNT);
        FigureList[] values = FigureList.values();
        FigureList randomFigureType = values[figureCount];
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();

        switch (randomFigureType) {
            case CIRCLE:
                double radius = random.nextInt(100);
                return new Circle(radius, randomColor);
            case SQUARE:
                double side = random.nextInt(100);
                return new Square(side, randomColor);
            case RECTANGLE: double length = random.nextInt(100);
                double width = random.nextInt(100);
                return new Rectangle(length, width, randomColor);
            case ISOSCELES_TRAPEZOID:
                double sideA = random.nextInt(100);
                double sideB = random.nextInt(100);
                double height = random.nextInt(100);
                return new IsoscelesTrapezoid(sideA, sideB, height, randomColor);
            case RIGHT_TRIANGLE:
                double firstLeg = random.nextInt(100);
                double secondLeg = random.nextInt(100);
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            default:
                throw new IllegalArgumentException("Unknown figure type: " + randomFigureType);
        }
    }

    public Figure getDefaultFigure() {
        double radius = 10;
        String color = "WHITE";
        return new Circle(radius, color);
    }
}
