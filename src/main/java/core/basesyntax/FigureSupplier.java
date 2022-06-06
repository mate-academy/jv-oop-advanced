package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final double DEFAULT_RADIUS = 10.0;

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }

    public Figure getRandomCircle() {
        Color randomColor = new ColorSupplier().getRandomColor();
        Random randomDouble = new Random();
        double radius = randomDouble.nextDouble() * MAX_RANDOM_NUMBER;
        return new Circle(radius, randomColor);
    }

    public Figure getRandomSquare() {
        Color randomColor = new ColorSupplier().getRandomColor();
        Random randomDouble = new Random();
        double side = randomDouble.nextDouble() * MAX_RANDOM_NUMBER;
        return new Square(side, randomColor);
    }

    public Figure getRandomRectangle() {
        Color randomColor = new ColorSupplier().getRandomColor();
        Random randomDouble = new Random();
        double length = randomDouble.nextDouble() * MAX_RANDOM_NUMBER;
        double width = randomDouble.nextDouble() * MAX_RANDOM_NUMBER;
        return new Rectangle(length, width, randomColor);
    }

    public Figure getRandomRightTriangle() {
        Color randomColor = new ColorSupplier().getRandomColor();
        Random randomDouble = new Random();
        double firstLeg = randomDouble.nextDouble() * MAX_RANDOM_NUMBER;
        double secondLeg = randomDouble.nextDouble() * MAX_RANDOM_NUMBER;
        return new RightTriangle(firstLeg, secondLeg, randomColor);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        Color randomColor = new ColorSupplier().getRandomColor();
        Random randomDouble = new Random();
        double topSide = randomDouble.nextDouble() * MAX_RANDOM_NUMBER;
        double downSide = randomDouble.nextDouble() * MAX_RANDOM_NUMBER;
        double height = randomDouble.nextDouble() * MAX_RANDOM_NUMBER;
        return new IsoscelesTrapezoid(topSide, downSide, height, randomColor);
    }
}
