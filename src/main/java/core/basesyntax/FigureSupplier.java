package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 10;
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                double radius = random.nextInt(MAX_VALUE) + 1;
                return new Circle(radius, color);
            case 1:
                double side = random.nextInt(MAX_VALUE) + 1;
                return new Square(color, side);
            case 2:
                double firstLeg = random.nextInt(MAX_VALUE) + 1;
                double secondLeg = random.nextInt(MAX_VALUE) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                double side1 = random.nextInt(MAX_VALUE) + 1;
                double side2 = random.nextInt(MAX_VALUE) + 1;
                return new Rectangle(color, side1, side2);
            case 4:
                double sideA = random.nextInt(MAX_VALUE) + 1;
                double sideB = random.nextInt(MAX_VALUE) + 1;
                double height = random.nextInt(MAX_VALUE) + 1;
                return new IsoscelesTrapezoid(color, sideA, sideB, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
