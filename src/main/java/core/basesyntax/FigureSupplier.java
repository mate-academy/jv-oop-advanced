package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_DIMENSION = 1;
    private static final int MAX_DIMENSION = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomNumber() {
        return random.nextInt(MIN_DIMENSION, MAX_DIMENSION);
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    public Figure getRandomFigure() {
        int randomFigureNumber = new Random().nextInt(Figures.values().length);
        String randomColor = getRandomColor();

        switch (randomFigureNumber) {
            case 0:
                int radius = getRandomNumber();
                return new Circle(radius, randomColor);

            case 1:
                int rectangleSideA = getRandomNumber();
                int rectangleSideB = getRandomNumber();
                return new Rectangle(rectangleSideA, rectangleSideB, randomColor);

            case 2:
                int side = getRandomNumber();
                return new Square(side, randomColor);

            case 3:
                int firstLeg = getRandomNumber();
                int secondLeg = getRandomNumber();
                return new RightTriangle(firstLeg, secondLeg, randomColor);

            case 4:
                double sideA = getRandomNumber();
                double sideB = getRandomNumber();
                double height = getRandomNumber();
                return new IsoscelesTrapezoid(sideA, sideB, height, randomColor);

            default:
                throw new IllegalStateException("Unexpected figure type: " + randomFigureNumber);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
