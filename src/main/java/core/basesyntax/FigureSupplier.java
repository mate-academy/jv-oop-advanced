package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int MAX_UNIQUE_PROPERTY = 150;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(NUMBER_OF_FIGURE);
        switch (number) {
            case 0:
                String colorCircle = colorSupplier.getRandomColor();
                double radius = random.nextInt(MAX_UNIQUE_PROPERTY);
                return new Circle(colorCircle, radius);
            case 1:
                String colorRectangle = colorSupplier.getRandomColor();
                double firstSide = random.nextInt(MAX_UNIQUE_PROPERTY);
                double secondSide = random.nextInt(MAX_UNIQUE_PROPERTY);
                return new Rectangle(colorRectangle, firstSide, secondSide);
            case 2:
                String colorSquare = colorSupplier.getRandomColor();
                double side = random.nextInt(MAX_UNIQUE_PROPERTY);
                return new Square(colorSquare, side);
            case 3:
                String colorTriangle = colorSupplier.getRandomColor();
                double firstLeg = random.nextInt(MAX_UNIQUE_PROPERTY);
                double secondLeg = random.nextInt(MAX_UNIQUE_PROPERTY);
                return new RightTriangle(colorTriangle, firstLeg, secondLeg);
            default:
                String colorTrapezoid = colorSupplier.getRandomColor();
                double height = random.nextInt(MAX_UNIQUE_PROPERTY);
                double firstBase = random.nextInt(MAX_UNIQUE_PROPERTY);
                double secondBase = random.nextInt(MAX_UNIQUE_PROPERTY);
                return new IsoscelesTrapezoid(colorTrapezoid, height, firstBase, secondBase);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.getValue(), 10);
    }
}
