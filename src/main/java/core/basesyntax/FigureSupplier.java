package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final double DEFAULT_RADIUS = 10.0;
    private Random random = new Random();

    public Figure getRandomFigure() {
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
        double radius = random.nextDouble() * MAX_RANDOM_NUMBER;
        Color randomColor = new ColorSupplier().getRandomColor();
        return new Circle(radius, randomColor);
    }

    public Figure getRandomSquare() {
        double side = random.nextDouble() * MAX_RANDOM_NUMBER;
        Color randomColor = new ColorSupplier().getRandomColor();
        return new Square(side, randomColor);
    }

    public Figure getRandomRectangle() {
        double length = random.nextDouble() * MAX_RANDOM_NUMBER;
        double width = random.nextDouble() * MAX_RANDOM_NUMBER;
        Color randomColor = new ColorSupplier().getRandomColor();
        return new Rectangle(length, width, randomColor);
    }

    public Figure getRandomRightTriangle() {
        double firstLeg = random.nextDouble() * MAX_RANDOM_NUMBER;
        double secondLeg = random.nextDouble() * MAX_RANDOM_NUMBER;
        Color randomColor = new ColorSupplier().getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, randomColor);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        double topSide = random.nextDouble() * MAX_RANDOM_NUMBER;
        double downSide = random.nextDouble() * MAX_RANDOM_NUMBER;
        double height = random.nextDouble() * MAX_RANDOM_NUMBER;
        Color randomColor = new ColorSupplier().getRandomColor();
        return new IsoscelesTrapezoid(topSide, downSide, height, randomColor);
    }
}
