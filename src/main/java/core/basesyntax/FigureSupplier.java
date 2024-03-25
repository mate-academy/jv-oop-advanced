package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_LIMIT = 100;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureType = random.nextInt(5); // 0 to 4 representing the different figure types
        switch (figureType) {
            case 0:
                // Create a Circle
                int radius = random.nextInt(NUMBER_LIMIT) + 1;
                Color color = colorSupplier.getRandomColor();
                return new Circle(radius, color);
            case 1:
                // Create an IsoscelesTrapezoid
                int height = random.nextInt(NUMBER_LIMIT) + 1;
                int smallerSide = random.nextInt(NUMBER_LIMIT) + 1;
                int biggerSide = random.nextInt(NUMBER_LIMIT) + 1;
                color = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(height, smallerSide, biggerSide, color);
            case 2:
                // Create a Rectangle
                int width = random.nextInt(NUMBER_LIMIT) + 1;
                int length = random.nextInt(NUMBER_LIMIT) + 1;
                color = colorSupplier.getRandomColor();
                return new Rectangle(width, length, color);
            case 3:
                // Create a RightTriangle
                int firstLeg = random.nextInt(NUMBER_LIMIT) + 1;
                int secondLeg = random.nextInt(NUMBER_LIMIT) + 1;
                color = colorSupplier.getRandomColor();
                return new RightTriangle(firstLeg, secondLeg, color);
            default:
                // Create a Square
                int generalSide = random.nextInt(NUMBER_LIMIT) + 1;
                color = colorSupplier.getRandomColor();
                return new Square(generalSide, color);
        }
    }

    public Figure getDefaultFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getDefaultColor();
        return new Circle(DEFAULT_RADIUS, color);
    }
}
