package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final double DEFAULT_RADIUS = 10;
    private static final Color CIRCLE_DEFAULT_COLOR = Color.WHITE;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURES_NUMBER);
        Color randomColor = colorSupplier.getRandomColor();
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
        return new Circle(CIRCLE_DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle(Color randomColor) {
        double radius = random.nextDouble();
        return new Circle(randomColor, radius);
    }

    private Figure getRandomRightTriangle(Color randomColor) {
        double firstLeg = random.nextDouble();
        double secondLeg = random.nextDouble();
        return new RightTriangle(randomColor, firstLeg, secondLeg);
    }

    private Figure getRandomSquare(Color randomColor) {
        double side = random.nextDouble();
        return new Square(randomColor, side);
    }

    private Figure getRandomRectangle(Color randomColor) {
        double length = random.nextDouble();
        double width = random.nextDouble();
        return new Rectangle(randomColor, length, width);
    }

    private Figure getRandomIsoscelesTrapezoid(Color randomColor) {
        double leg = random.nextDouble();
        double firstBase = random.nextDouble();
        double secondBase = random.nextDouble();
        return new IsoscelesTrapezoid(randomColor, leg, firstBase, secondBase);
    }
}
