package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_NUMBER = 20;
    public static final double DEFAULT_RADIUS = 10.0;

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Color randomColor = new ColorSupplier().getRandomColor();

        switch (figureNumber) {
            case 1:
                double radius = random.nextDouble() * MAX_RANDOM_NUMBER;
                return new Circle(radius, randomColor);
            case 2:
                double side = random.nextDouble() * MAX_RANDOM_NUMBER;
                return new Square(side, randomColor);
            case 3:
                double length = random.nextDouble() * MAX_RANDOM_NUMBER;
                double width = random.nextDouble() * MAX_RANDOM_NUMBER;
                return new Rectangle(length, width, randomColor);
            case 4:
                double firstLeg = random.nextDouble() * MAX_RANDOM_NUMBER;
                double secondLeg = random.nextDouble() * MAX_RANDOM_NUMBER;
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            default:
                double topSide = random.nextDouble() * MAX_RANDOM_NUMBER;
                double downSide = random.nextDouble() * MAX_RANDOM_NUMBER;
                double height = random.nextDouble() * MAX_RANDOM_NUMBER;
                return new IsoscelesTrapezoid(topSide, downSide, height, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }
}
