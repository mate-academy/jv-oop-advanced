package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int MIN_SIZE = 1;
    private static final int MIN_INDEX = 0;
    private static final int MAX_INDEX = 5;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        String color = colorSupplier.getRandomColor();

        int randomValue = random.nextInt(MIN_SIZE, MAX_SIZE);
        int randomValue1 = random.nextInt(MIN_SIZE, MAX_SIZE);
        int randomValue2 = random.nextInt(MIN_SIZE, MAX_SIZE);

        int randomIndex = random.nextInt(MIN_INDEX, MAX_INDEX);
        switch (randomIndex) {
            case 0:
                Circle circle = new Circle(color, randomValue);
                return circle;
            case 1:
                Rectangle rectangle = new Rectangle(color, randomValue, randomValue1);
                return rectangle;
            case 2:
                Square square = new Square(color, randomValue);
                return square;
            case 3:
                RightTriangle rightTriangle = new RightTriangle(color, randomValue, randomValue1);
                return rightTriangle;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(color, randomValue, randomValue1, randomValue2);
                return isoscelesTrapezoid;
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        String white = Color.WHITE.name();
        Circle circle = new Circle(white, DEFAULT_RADIUS);
        return circle;
    }
}
