package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int RADIUS = 10;
    static final int SIDE_LIMITS = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Figure getRandomFigure() {
        Figures randomFigure = Figures.values()[new Random().nextInt(Figures.values().length)];

        if (randomFigure == Figures.SQUARE) {
            String randomColor = colorSupplier.getRandomColor();
            int randomSide = getRandomNumber();
            return new Square(randomColor, randomSide);
        }
        if (randomFigure == Figures.RECTANGLE) {
            String randomColor = colorSupplier.getRandomColor();
            int randomSideA = getRandomNumber();
            int randomSideB = getRandomNumber();
            return new Rectangle(randomColor, randomSideA, randomSideB);
        }
        if (randomFigure == Figures.CIRCLE) {
            String randomColor = colorSupplier.getRandomColor();
            int randomRadius = getRandomNumber();
            return new Circle(randomColor, randomRadius);
        }
        if (randomFigure == Figures.RIGHT_TRIANGLE) {
            String randomColor = colorSupplier.getRandomColor();
            int randomFirstLeg = getRandomNumber();
            int randomSecondLeg = getRandomNumber();
            return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
        }
        if (randomFigure == Figures.ISOSCELES_TRAPEZOID) {
            String randomColor = colorSupplier.getRandomColor();
            int randomSideA = getRandomNumber();
            int randomSideB = getRandomNumber();
            int randomHeight = getRandomNumber();
            return new IsoscelesTrapezoid(randomColor, randomSideA, randomSideB, randomHeight);
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), RADIUS);
    }

    private int getRandomNumber() {
        return new Random().nextInt(SIDE_LIMITS) + 1;
    }
}
