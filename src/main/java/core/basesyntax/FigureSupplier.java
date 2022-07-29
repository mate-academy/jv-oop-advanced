package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int figureCount = 5;
    private final double defaultRadius = 10;
    private final String circleDefaultColor = "White";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(figureCount);
        String randomColor = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return getRandomCircle(randomColor);
            case 1:
                return getRandomRightTriangle(randomColor);
            case 2:
                return getRandomSquare(randomColor);
            case 3:
                return getRandomRectangle(randomColor);
            default:
                return getRandomIsoscelesTrapezoid(randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(circleDefaultColor, defaultRadius);
    }

    private Figure getRandomCircle(String randomColor) {
        double radius = random.nextDouble();
        return new Circle(randomColor, radius);
    }

    private Figure getRandomRightTriangle(String randomColor) {
        double firstLeg = random.nextDouble();
        double secondLeg = random.nextDouble();
        return new RightTriangle(randomColor, firstLeg, secondLeg);
    }

    private Figure getRandomSquare(String randomColor) {
        double side = random.nextDouble();
        return new Square(randomColor, side);
    }

    private Figure getRandomRectangle(String randomColor) {
        double length = random.nextDouble();
        double width = random.nextDouble();
        return new Rectangle(randomColor, length, width);
    }

    private Figure getRandomIsoscelesTrapezoid(String randomColor) {
        double leg = random.nextDouble();
        double firstBase = random.nextDouble();
        double secondBase = random.nextDouble();
        return new IsoscelesTrapezoid(randomColor, leg, firstBase, secondBase);
    }
}
